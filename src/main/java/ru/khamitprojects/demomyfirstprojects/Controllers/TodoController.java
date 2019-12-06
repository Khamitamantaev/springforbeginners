package ru.khamitprojects.demomyfirstprojects.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;
import ru.khamitprojects.demomyfirstprojects.service.ToDoService;
import ru.khamitprojects.demomyfirstprojects.service.UserService;

import java.util.List;

@Controller
public class TodoController {

    private ToDoService toDoService;
    private UserService userService;

    @Autowired
    public TodoController(ToDoService toDoService, UserService userService) {
        this.toDoService = toDoService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String indexPage( Model model) {
        List<ToDoRepr> todos = toDoService.findToDosByUserId(userService.getCurrentUserId().orElseThrow(ResourceNotFoundException::new));
        model.addAttribute("todos", todos);
        return "index";
    }

    @GetMapping("/todo/{id}")
    public String todoPage(@PathVariable("id") Long id , Model model) {
        ToDoRepr toDoRepr = toDoService.findById(id).orElseThrow(ResourceNotFoundException::new);
        model.addAttribute("todo", toDoRepr);
        return "todo"; // остановился на 47 минуте видео 
    }


}
