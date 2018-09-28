package movieapp.demo;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieRepositoryImpl() {
        movies.add(new Movie("BraveHeart", "1994", "234", "Drama"));
        movies.add(new Movie("title1", "2018", "actor", "descriptor"));
        movies.add(new Movie("title2", "2018", "actor", "descriptor"));
        movies.add(new Movie("title3", "2018", "actor", "descriptor"));
        movies.add(new Movie("title4", "2018", "actor", "descriptor"));

    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public void save(Movie movie) {
        movies.add(new Movie());
        movies.add(new Movie("LOL","LOL","LOL","LOL")); //TEST!!
    }

    /*
    @Override
    public Movie search(String title){
            for (Movies m: movies) {
            if(m.getMovieTitle().toLowerCase().contains(movieTitle)){
                searchMovies.add(m);
            }
            return movie;
        }
        return null;
    }
    */
}
