package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.guru.springframework.spring5jokesappv2.services.JokesService;

@Controller
public class JokeController {

    private final JokesService jokeService;


    public JokeController(java.guru.springframework.spring5jokesappv2.services.JokesService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    private String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
