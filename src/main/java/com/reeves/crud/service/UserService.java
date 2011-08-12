package com.reeves.crud.service;

import com.reeves.crud.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface UserService {
    public List<User> list();

    @Transactional(readOnly = false)
    public void add(User user);

    public User load(Long id);

    @Transactional(readOnly = false)
    public void update(User user);

    @Transactional(readOnly = false)
    public void delete(Long id);
}
