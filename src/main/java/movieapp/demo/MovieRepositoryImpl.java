package movieapp.demo;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();


    public MovieRepositoryImpl() {
        movies.add(new Movie(1,"BraveHeart", "1994", "186", "Drama"));
        movies.add(new Movie(2,"The Predator", "2018", "107", "Action"));
        movies.add(new Movie(3,"The Meg", "2018", "113", "Sci-fi"));
        movies.add(new Movie(4,"Crazy Rich Asians", "2018", "120", "Comedy"));
        movies.add(new Movie(5,"Deadpool 2", "2018", "119", "Comedy"));

    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public void save(Movie movie) {
        movie.setId(movies.size() + 1);  //Set ID + 1 ift. .size, ved tilføjelse af nye film.
        movies.add(movie);
    }


    @Override
    public Movie search(String title){
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().contains(title))
            {
                return movies.get(i);
            }
        }
        return null;
    }


}
