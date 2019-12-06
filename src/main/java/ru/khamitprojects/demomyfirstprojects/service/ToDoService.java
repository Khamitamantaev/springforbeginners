package ru.khamitprojects.demomyfirstprojects.service;

import org.springframework.stereotype.Service;
import ru.khamitprojects.demomyfirstprojects.persist.entity.ToDo;
import ru.khamitprojects.demomyfirstprojects.persist.repo.ToDoRepository;
import ru.khamitprojects.demomyfirstprojects.persist.repo.UserRepository;
import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static ru.khamitprojects.demomyfirstprojects.service.UserService.getCurrentUser;

@Service
@Transactional
public class ToDoService {
    private ToDoRepository toDoRepository;
    private UserRepository userRepository;

    public ToDoService(ToDoRepository toDoRepository, UserRepository userRepository) {
        this.toDoRepository = toDoRepository;
        this.userRepository = userRepository;
    }
    public Optional<ToDoRepr> findById(Long id){
        return toDoRepository.findById(id).map(ToDoRepr::new);
    }
    public List<ToDoRepr> findToDosByUserId(Long userId){
        return toDoRepository.findToDosByUserId(userId);

    }

    public void save(ToDoRepr toDoRepr) {
        getCurrentUser()
                .flatMap(userRepository::getUserByUsername)
                .ifPresent(user -> {
                    ToDo toDo = new ToDo();
                    toDo.setId(toDoRepr.getId());
                    toDo.setDescription(toDoRepr.getDescription());
                    toDo.setTargetDate(toDoRepr.getTargetDate());
                    toDo.setUser(user);
                    toDoRepository.save(toDo);
                });
    }

    public void delete(Long id) {
       toDoRepository.findById(id)
        .ifPresent(toDo -> toDoRepository.delete(toDo));
    }
}
