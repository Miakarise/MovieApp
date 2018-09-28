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
    public Movie searchMovie(String title){
        return moviesRepo.search();
    }

    */


}

