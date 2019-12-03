package ru.khamitprojects.demomyfirstprojects.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.khamitprojects.demomyfirstprojects.persist.entity.User;
import ru.khamitprojects.demomyfirstprojects.persist.repo.UserRepository;

import java.util.Optional;

public class UserAuthService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserAuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> optUser = userRepository.getUserByUsername(username);
        return null;
    }
}
