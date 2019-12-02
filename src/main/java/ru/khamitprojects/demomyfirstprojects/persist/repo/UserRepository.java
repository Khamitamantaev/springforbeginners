package ru.khamitprojects.demomyfirstprojects.persist.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.khamitprojects.demomyfirstprojects.persist.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
