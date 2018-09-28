package movieapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepositoryImpl moviesRepo;


    public List<Movie> getAllMovies() {
        return moviesRepo.findAll();
    }


    public void saveMovie(Movie movie){
        moviesRepo.save(movie);
    }

    /*
    public Movie searchMovie(){
        return moviesRepo.search();
    }

    public Movie getMovie(String title, String year, String duration, String genre) {
        return null; //movies

    }

    public void addMovie() {
        moviesRepo.create();
    }
    */
}



    /*public void updateMovie(){
        for (int i = 0; i < movies.size(); i++){
            Movie m = movies.get(i);
            if (m.getMovie().equals(movies)){
                movies.set(i, movies);
                return;
            }
        }

    }*/

