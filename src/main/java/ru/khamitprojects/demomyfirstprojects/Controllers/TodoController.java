package ru.khamitprojects.demomyfirstprojects.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;
import ru.khamitprojects.demomyfirstprojects.service.ToDoService;
import ru.khamitprojects.demomyfirstprojects.service.UserService;

@Controller
public class TodoController {

    private ToDoService toDoService;

    @Autowired
    public TodoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/todo/{id}")
    public String todoPage(@PathVariable("id") Long id , Model model) {
        ToDoRepr toDoRepr = toDoService.findById(id).orElseThrow(ResoureNotFoundException::new);
        model.addAttribute("todo", toDoRepr);
        return "todo";
    }


}
