package controllers;

import model.*;
import java.sql.*;
import java.util.HashMap;
import java.util.HashSet;

public class ShowController {
    public ShowController(){
        
    }
    //map id = tuple of data(name, showtime, showroom)


     //Method to create a connection to the database, no arguments, no return value  

    private HashMap<String, Movie> movieDataByName = new HashMap<String, Movie>();
    private HashMap<Integer, Movie> movieDataByID = new HashMap<Integer, Movie>();

    public void pullMovieData(){
        String sql = "select * from moviesdb";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = dbConnect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //adds movie names to the hashset. this can be sped up,
                //but leaving this in parts for clarity of how this is done.
                Movie tempMovie = new Movie();
                String movieName = rs.getString("Mname");
                int ID = rs.getInt("idMovies");
                tempMovie.movieID = ID;
                tempMovie.movieName = movieName;
                tempMovie.movieLength = rs.getInt("Length");
                tempMovie.showTime = rs.getInt("ShowTime");
                tempMovie.showRoom = rs.getInt("ShowRoom");

                movieDataByName.put(movieName, tempMovie);
                movieDataByID.put(ID, tempMovie);
            }
        }
        catch(Exception e){

        }

        
    }

}
