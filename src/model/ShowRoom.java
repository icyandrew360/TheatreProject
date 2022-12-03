
package model;
import java.util.Vector;

public class ShowRoom{

    //need a seats hashmap here
    private int showRoomNumber;
    private Vector<ShowTimes> showTimes;
    private Movie movie;

    public ShowRoom(int showRoomNumber, Movie movie){
        this.showRoomNumber = showRoomNumber;
        this.movie = movie;
        this.showTimes = new Vector<ShowTimes>(0);
    }

    public int getShowRoomNumber(){
        return this.showRoomNumber;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public Vector<ShowTimes> getShowTimes(){
        return this.showTimes;
    }

    public void setShowRoomNumber(int newShowRoomNumber){
        this.showRoomNumber = newShowRoomNumber;
    }

    public void setMovie(Movie newMovie){
        this.movie = newMovie;
    }

    public void addShowTime(ShowTimes newShowTime){
        this.showTimes.add(newShowTime);
    }

    public void removeShowTime(ShowTimes showTimeToRemove){
        this.showTimes.remove(showTimeToRemove);
    }

   
}