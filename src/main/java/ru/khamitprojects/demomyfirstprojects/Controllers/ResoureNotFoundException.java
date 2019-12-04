package ru.khamitprojects.demomyfirstprojects.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResoureNotFoundException extends RuntimeException {

}
