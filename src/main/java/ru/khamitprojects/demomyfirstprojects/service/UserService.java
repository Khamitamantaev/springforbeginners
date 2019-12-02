package ru.khamitprojects.demomyfirstprojects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.khamitprojects.demomyfirstprojects.persist.entity.User;
import ru.khamitprojects.demomyfirstprojects.persist.repo.UserRepository;
import ru.khamitprojects.demomyfirstprojects.repr.UserRepr;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserRepr userRepr){
        User user = new User();
        user.setUsername(userRepr.getUsername());
        user.setPassword(userRepr.getPassword());
        userRepository.save(user);

    }
}
