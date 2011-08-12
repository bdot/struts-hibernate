package com.reeves.crud.web;

import com.opensymphony.xwork2.ActionSupport;
import com.reeves.crud.domain.User;
import com.reeves.crud.service.UserService;

import java.util.List;

public class UserAction extends ActionSupport {
    private List<User> users;
    private User user;

    private UserService userService;

    public String listUsers() throws Exception {
        users = userService.list();
        return SUCCESS;
    }

    public String newUser() throws Exception {
        if ((user != null) && (user.getId() != null)) {
            user = userService.load(user.getId());
        }
        return SUCCESS;
    }

    public String saveUser() throws Exception {
        if (user.getId() == null) {
            userService.add(user);
        } else {
            userService.update(user);
        }
        return SUCCESS;
    }

    public String deleteUser() throws Exception {
        userService.delete(user.getId());
        return SUCCESS;
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
