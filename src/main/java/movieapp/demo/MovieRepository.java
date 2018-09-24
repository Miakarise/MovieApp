package movieapp.demo;

import java.util.List;

public interface MovieRepository {

    List<Movie> findAll();
    void create(Movie mov);
}
