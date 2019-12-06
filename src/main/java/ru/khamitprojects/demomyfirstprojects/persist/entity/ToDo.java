package ru.khamitprojects.demomyfirstprojects.persist.entity;

import ru.khamitprojects.demomyfirstprojects.repr.ToDoRepr;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todos")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String description;

    @ManyToOne// данная таблица , здесь будет связь , многие к одному, что значит , у нас есть залогинивщийся пользователь, у которого, будет много записей на его странице
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private LocalDate targetDate;

    public ToDo() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }
}
