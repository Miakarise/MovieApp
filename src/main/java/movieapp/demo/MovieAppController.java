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


    //*************** INDEX.HTML************************


    //Index.HTML
    @GetMapping("/")
    public String index(Model model){
        log.info("Index action called...");

        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);   //"movies" er nøglen i HTML!!
        return "index";
    }


    //*************** CREATE.HTML************************


    //Get controller for create.HTML
    @GetMapping("/create")
    public String create(Model model) {
        log.info("create action called...");

        model.addAttribute("movie", new Movie());  //"movie" er nøglen i HTML!!
        return "create";
    }

    //Post controller for create.HTML
    @PostMapping("/create")
    public String create(@ModelAttribute Movie movie) {
        log.info("create post action called...");

        movieService.saveMovie(movie);
        return "redirect:/";
    }


    //*************** SEARCH.HTML************************


    //Get controller for search.HTML
    @GetMapping("/search")
    public String search(String title, Model model){
        log.info("search action called...");

        model.addAttribute("title", movieService.searchMovie(title));
        return "search";
    }
}
