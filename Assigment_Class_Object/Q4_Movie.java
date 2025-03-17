package Assigment_Class_Object;

import java.util.ArrayList;
import java.util.List;

public class Q4_Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private static List<Q4_Movie> movies = new ArrayList<>();
    private static int movieCount = 0;

    public Q4_Movie(String title, String director,  int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        movieCount++;
    }
    public static void add(Q4_Movie movie){
        movies.add(movie);
    }
    public static void diplay(){
        for(Q4_Movie  movie:movies){
            System.out.println(movie.toString());
        }
            
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }



    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return "MovieDTO{" +"title='" + title + '\'' +", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +", rating=" + rating +'}';
    }
    public static void main(String[] args) {
       Q4_Movie movie1=new Q4_Movie("bahubali", "vj", 2012, 8.8); 
       Q4_Movie movie2=new Q4_Movie("bahubali2", "vj",2016, 7.2);
       add(movie1);
       add(movie2);
       diplay();
    }
}
