package controllers;

import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.util.HashMap;


public class ShowController {

    private DBController onlyInstance;

    public ShowController(){
        this.onlyInstance = DBController.getConnection();
    }
    //map id = tuple of data(name, showtime, showroom)


     //Method to create a connection to the database, no arguments, no return value  
    private ArrayList<String> searchableMovieList = new ArrayList<String>();
    private HashMap<String, Movie> movieDataByName = new HashMap<String, Movie>();

    public void pullMovieData(){
        String sql = "select * from movies";
        PreparedStatement p = null;
        ResultSet rs = null;
        
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                
                String movieName = rs.getString("MovieName");
                int movieLength = rs.getInt("Length");
                //adds movies to a list of strings, allowing for searching
                searchableMovieList.add(movieName);
                //adds movie names to the hashmap, allowing for moviedata to be accessed by movie name
                movieDataByName.put(movieName, new Movie(movieName, movieLength));
            }
            //sort the search list for binary search implementation (DID NOT USE BINARY SEARCH BECAUSE we are returning all instances)
            Collections.sort(searchableMovieList);
        }
        //exception handling
        catch(Exception e){
            e.printStackTrace();
        }
    }


    //given any string, return the first movie that has that substring in the title
    public String searchMovie(String substring){
        //pull moviedata from the database into our hashmap and movie title list
        pullMovieData();
        substring = substring.toLowerCase();

        for (int i = 0; i < searchableMovieList.size(); i++){
            //if we find a movie name with the substring in it:
            if (searchableMovieList.get(i).toLowerCase().contains(substring)){
                //return the first instance of a movie containing the substring
                return searchableMovieList.get(i);
            }
        }
        //if we didnt find a match, return this special movie
        return ("noDecimalsLand");
    }

    //takes in a specific movie and showtime, returns the taken seats for that showtime
    public ArrayList<String> getTakenSeats(String movieName, int showTime){
        String sql = "select * from movies";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //if this movie and showtime are in the database, return the taken seats parsed into an arrayList
                if (rs.getString("MovieName").equals(movieName)  && rs.getInt("ShowTime") == showTime){
                    String[] array = rs.getString("SoldSeats").split("(?<=\\G.{2})");//using regex to split the string into an array of each seat of 2 chars

                    //conversion to arraylist for easier modification
                    ArrayList<String> seatsArrayList = new ArrayList<String>(Arrays.asList(array));
                    return (seatsArrayList);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //if movie and showtime were not found
        return null;
    }  
    
    //creates a ticket from user selected options
    public Ticket createTicketAndAddSeats(User user, String seats, String movieName, int showTime){
        String sql = "select * from movies";
        PreparedStatement p = null;
        ResultSet rs = null;
        Ticket temp = null;
        String currentSeats = null;
        int movieID = 0;
        int length = -1;
        String showDate = null;
        int showRoom = -1;
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //if this movie and showtime are in the database, save all of its data and add to a ticket object
                if (rs.getString("MovieName").equals(movieName)  && rs.getInt("ShowTime") == showTime){
                    movieID = rs.getInt("MoviesID");
                    length = rs.getInt("Length");
                    showDate = rs.getString("ShowDate");
                    showRoom = rs.getInt("ShowRoom");
                    currentSeats = rs.getString("SoldSeats");
                    temp = new Ticket(movieID, user.getEmail(), seats, showRoom, showTime, showDate, movieName);
                }
            }

            String query = "DELETE FROM movies WHERE MoviesID = ?"; // Creating the query command
            PreparedStatement myStmt = this.onlyInstance.getDBConnection().prepareStatement(query); // Executing the query
            //delete the current movie ticket data in the database, replace with new
            myStmt.setInt(1, movieID);
                        
            myStmt.executeUpdate();   

            //fill movie database with new ticket data
            p = this.onlyInstance.getDBConnection().prepareStatement("INSERT INTO movies(MoviesID, MovieName, Length, ShowTime, ShowRoom, SoldSeats, ShowDate) VALUES (?, ?, ?, ?, ?, ?, ?)");
            p.setInt(1, movieID);
            p.setString(2, movieName);
            p.setInt(3, length);
            p.setInt(4, showTime);
            p.setInt(5, showRoom);
            p.setString(6, currentSeats + seats);
            p.setString(7, showDate);
            p.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }

    //given movieID and seats, remove the ticket and free the seats
    public void removeTickets(int MovieID, String seats){
        String sql = "select * from movies";
        PreparedStatement p = null;
        ResultSet rs = null;
        String currentSeats = null;
        int movieID = 0;
        String mName = null;
        int length = -1;
        String showDate = null;
        int showRoom = -1;
        int showTime = -1;
        //split database string into an array of each seat
        String[] seatsToRemove = seats.split("(?<=\\G.{2})");
        try{

            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //find seats list for the given movie
                if (rs.getInt("MoviesID") == MovieID){
                    currentSeats  = rs.getString("SoldSeats");
                    movieID = rs.getInt("MoviesID");
                    mName = rs.getString("MovieName");
                    length = rs.getInt("Length");
                    showDate = rs.getString("ShowDate");
                    showRoom = rs.getInt("ShowRoom");
                    showTime = rs.getInt("ShowTime");
                    break;
                }
            }
            //remove seats from seats list
            for(int i = 0; i < seatsToRemove.length; i++)
                currentSeats = currentSeats.replace(seatsToRemove[i], "");
           
            //remove row to remove the ticket data
            String query = "DELETE FROM movies WHERE MoviesID = ?"; // Creating the query command
            PreparedStatement myStmt = this.onlyInstance.getDBConnection().prepareStatement(query);
            myStmt.setInt(1, movieID);
            myStmt.executeUpdate();  

            //add updated row back, with null values
            p = this.onlyInstance.getDBConnection().prepareStatement("INSERT INTO movies(MoviesID, MovieName, Length, ShowTime, ShowRoom, SoldSeats, ShowDate) VALUES (?, ?, ?, ?, ?, ?, ?)");
            p.setInt(1, movieID);
            p.setString(2, mName);
            p.setInt(3, length);
            p.setInt(4, showTime);
            p.setInt(5, showRoom);
            p.setString(6, currentSeats);
            p.setString(7, showDate);
            p.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public Vector<Integer> getShowTimes(String movieTitle){
        String sql = "select * from movies";
        PreparedStatement p = null;
        ResultSet rs = null;
        Vector<Integer> showTimes = new Vector<Integer>();
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //if this movietitle is in the database, take the showtimes and add them to the showTimes vector
                if (rs.getString("MovieName").equals(movieTitle)){
                    showTimes.add(rs.getInt("ShowTime"));
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return showTimes;
    }

    //given movie title, return the run time of the movie
    public int getMovieLength(String movieTitle){
        String sql = "select * from movies";
        PreparedStatement p = null;
        ResultSet rs = null;
        int movieLength = 0;
        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //if this movie is found in the db, return its length (in minutes);
                if (rs.getString("MovieName").equals(movieTitle)){
                    movieLength = rs.getInt("Length");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return movieLength;
    }
}
