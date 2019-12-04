package ru.khamitprojects.demomyfirstprojects.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.khamitprojects.demomyfirstprojects.service.UserService;

@Controller
public class TodoController {

    private UserService userService;

    @Autowired
    public TodoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/todo/{id}")
    public String todoPage(@PathVariable("id") Long Id) {
        return "todo";
    }


}
