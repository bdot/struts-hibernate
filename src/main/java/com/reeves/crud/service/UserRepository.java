package com.reeves.crud.service;

import com.reeves.crud.domain.User;

import java.util.List;

public interface UserRepository {
    public List<User> list();

    public void add(User user);

    public User load(Long id);

    public void update(User user);

    public void delete(Long id);
}
