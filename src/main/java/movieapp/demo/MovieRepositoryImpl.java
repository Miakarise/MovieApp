package movieapp.demo;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieRepositoryImpl() {
        movies.add(new Movie("BraveHeart", "1994", "186", "Drama"));
        movies.add(new Movie("The Predator", "2018", "107", "Action"));
        movies.add(new Movie("The Meg", "2018", "113", "Sci-fi"));
        movies.add(new Movie("Crazy Rich Asians", "2018", "120", "Comedy"));
        movies.add(new Movie("Deadpool 2", "2018", "119", "Comedy"));

    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public void save(Movie movie) {
        movies.add(movie);
    }

    /*
    @Override
    public Movie search(String title){
        for (int i = 0; i < movies.size(); i++) {
            if (movies[i].getTitle().contains()) {
                return movies[i].getTitle();
            }
        }
        return null;
    }
    */

}
