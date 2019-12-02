package ru.khamitprojects.demomyfirstprojects.repr;


import java.time.LocalDate;

public class ToDoRepr { // будет содержать представления todo записи
    private long id;
    private String description;

    private String username;

    private LocalDate targetDate;

    public ToDoRepr() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }
}
