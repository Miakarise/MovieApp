package movieapp.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class MovieAppController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String index(Model model){
        log.info("Index action called...");
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);   //"movies" er nøglen i HTML!!
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        log.info("create action called...");
        model.addAttribute("movie", new Movie("","","",""));  //"movie" er nøglen i HTML!!
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Movie movie, Model model) {
        log.info("create post action called...");
        model.addAttribute("movie", new Movie("","","",""));
        //model.addAttribute("year", new Movie());
        //model.addAttribute("duration", new Movie());
        //model.addAttribute("genre", new Movie());
        movieService.saveMovie(movie);

        return "redirect:/";
    }
    /*
    @RequestMapping("/create")
    public String create(@ModelAttribute Movie movie, Model model){
        log.info("create was called");
        movieService.saveMovie();
        model.addAttribute("movie", new Movie());
        return "redirect:/";
    }
   */







    @GetMapping("/search")
    public String search(Model model){
        log.info("search action called...");
        //String searchMovie = movieService.searchMovie();
        //model.addAttribute("Search", searchMovie);
        return "search";
    }

}
