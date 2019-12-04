package ru.khamitprojects.demomyfirstprojects.persist.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.khamitprojects.demomyfirstprojects.persist.entity.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
