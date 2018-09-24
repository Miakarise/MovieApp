package movieapp.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieRepositoryImpl() {
        movies.add(new Movie("title", "2018", "actor", "descriptor"));
        movies.add(new Movie("title1", "2018", "actor", "descriptor"));
        movies.add(new Movie("title2", "2018", "actor", "descriptor"));
        movies.add(new Movie("title3", "2018", "actor", "descriptor"));
        movies.add(new Movie("title4", "2018", "actor", "descriptor"));

    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    //@Override
    //public void create(Movie mov){

    //}

}
