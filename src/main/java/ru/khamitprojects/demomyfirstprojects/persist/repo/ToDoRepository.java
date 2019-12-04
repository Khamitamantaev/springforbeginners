package ru.khamitprojects.demomyfirstprojects.persist.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.khamitprojects.demomyfirstprojects.persist.entity.ToDo;
import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

     @Query("select new ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr(t) t from ToDo t" +
     "inner join fetch User u"+
             "where u.id = :userId")
     List<ToDoRepr> findToDosByUserId(@Param("userId") Long userId);

    }
