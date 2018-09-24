package movieapp.demo;


import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Movie {


    private String title;
    private String year;
    private String duration;
    private String genre;

    public Movie(){

    }

    public Movie(String title, String year, String duration, String genre) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
