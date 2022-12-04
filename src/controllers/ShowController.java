package controllers;

import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ShowController {

    private DBController onlyInstance;

    public ShowController(){
        this.onlyInstance = DBController.getConnection();
    }
    //map id = tuple of data(name, showtime, showroom)


     //Method to create a connection to the database, no arguments, no return value  
    private ArrayList<String> searchableMovieList = new ArrayList<String>();
    private HashMap<String, Movie> movieDataByName = new HashMap<String, Movie>();
    // private HashMap<Integer, Movie> movieDataByID = new HashMap<Integer, Movie>();

    public void pullMovieData(){
        String sql = "select * from moviesdb";
        PreparedStatement p = null;
        ResultSet rs = null;

        try{
            p = this.onlyInstance.getDBConnection().prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()){
                //adds movie names to the hashset. this can be sped up,
                //but leaving this in parts for clarity of how this is done.
                String movieName = rs.getString("Mname");
                int ID = rs.getInt("idMovies");
                int movieLength = rs.getInt("Length");

                searchableMovieList.add(movieName);//these kept their cases, not all lowercase
                movieDataByName.put(movieName, new Movie(movieName, movieLength));
                // movieDataByID.put(ID, tempMovie);
            }
            //sort the search list for binary search implementation (DID NOT USE BINARY SEARCH BECAUSE we are returning all instances)
            Collections.sort(searchableMovieList);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    //given any string, return the first move that has that substring in the title
    public String searchMovie(String substring){
        substring = substring.toLowerCase();

        for (int i = 0; i < searchableMovieList.size(); i++){
            //if we find a movie name with the substring in it:
            if (searchableMovieList.get(i).toLowerCase().contains(substring)){
                //return the first instance of a movie containing the substring
                return searchableMovieList.get(i);
            }
        }
        //if we didnt find a match:
        return searchableMovieList.get(0);
    }
}
