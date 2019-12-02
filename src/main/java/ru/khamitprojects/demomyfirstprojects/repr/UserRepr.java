package ru.khamitprojects.demomyfirstprojects.repr;

import javax.validation.constraints.NotEmpty;

public class UserRepr {
    private long id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String matchingPassword;
}
