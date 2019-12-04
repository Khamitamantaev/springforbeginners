package ru.khamitprojects.demomyfirstprojects.service;

import org.springframework.stereotype.Service;
import ru.khamitprojects.demomyfirstprojects.persist.repo.ToDoRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
}
