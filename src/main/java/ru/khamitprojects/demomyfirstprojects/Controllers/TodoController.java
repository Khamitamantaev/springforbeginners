package ru.khamitprojects.demomyfirstprojects.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping
    public String todoPage() {
        return "todo";
    }
}
