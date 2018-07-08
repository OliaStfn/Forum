package com.stfn.beans;

import java.time.LocalDateTime;

public class User extends Person {
    private int id;
    private String login;
    private String password;
    private State state;
    private Group group;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}
