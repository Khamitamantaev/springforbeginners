package ru.khamitprojects.demomyfirstprojects.service;

import org.springframework.stereotype.Service;
import ru.khamitprojects.demomyfirstprojects.persist.repo.ToDoRepository;
import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    public ToDoRepr findById(Long Id){
        return null;
    }
    public List<ToDoRepr> findTodosByUsername( ){
        return null;
    }
}
