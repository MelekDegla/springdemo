package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String body;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
