package movieapp.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class MovieAppController {

    @GetMapping("/")
    public String index(){
        return "index";


    }




}
