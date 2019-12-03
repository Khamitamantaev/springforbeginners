package ru.khamitprojects.demomyfirstprojects.persist.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.khamitprojects.demomyfirstprojects.persist.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    boolean existByUsername(String username);

    Optional<User> getUserByUsername(String username);

}
