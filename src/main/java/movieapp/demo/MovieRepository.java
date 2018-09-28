package movieapp.demo;

import java.util.List;

public interface MovieRepository {

    List<Movie> findAll();
    void save(Movie movie);
    //Movie search(String title);

}
