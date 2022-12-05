package model;
import java.util.ArrayList;

/*
* File: Movie.java
* Assignment: ENSF480 Final Project
* Section: L02
* Due Date: Dec. 4, 2022
* Authors: Andrew Howe (30113096), James Platt (30130627),
* Jenna Vlaar (30113774) and Sadman Shahriar (30121460)
*/

//class for containing movie infromation
public class Movie
{
  private String movieName;
  private int movieLength;

  //constructor
  public Movie(String movieName, int movieLength){
    this.movieLength = movieLength;
    this.movieName = movieName;
  }

  //getters
  public String getMovieName(){
    return this.movieName;
  }

  public int getMovieLength(){
    return this.movieLength;
  }

  //setters
  public void setMovieName(String newMovieName){
    this.movieName = newMovieName;
  }

  public void setMovieLength(int newMovieLength){
    this.movieLength = newMovieLength;
  }

  
}
