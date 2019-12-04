package ru.khamitprojects.demomyfirstprojects.service;

import org.springframework.stereotype.Service;
import ru.khamitprojects.demomyfirstprojects.persist.repo.ToDoRepository;
import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    public Optional<ToDoRepr> findById(Long id){
        return toDoRepository.findById(id).map(ToDoRepr::new);
    }
    public List<ToDoRepr> findToDosByUserId(Long userId){
        return toDoRepository.findToDosByUserId(userId);
        
    }
}
