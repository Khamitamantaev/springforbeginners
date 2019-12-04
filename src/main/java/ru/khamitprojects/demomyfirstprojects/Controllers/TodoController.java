package ru.khamitprojects.demomyfirstprojects.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.khamitprojects.demomyfirstprojects.service.UserService;

@Controller
public class TodoController {

    private UserService userService;

    public TodoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/todo")
    public String todoPage() {
        return "todo";
    }


}
