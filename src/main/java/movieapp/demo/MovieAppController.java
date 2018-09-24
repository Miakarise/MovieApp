package movieapp.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieAppController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public String index(Model model){
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        log.info("create action called...");
        model.addAttribute("movie", new Movie());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Movie movie, Model model) {
        log.info("create post action called...");

        movieService.addMovie(movie);
        model.addAttribute("movie", movieService.getAllMovies());

        return "redirect:/";
    }






}
