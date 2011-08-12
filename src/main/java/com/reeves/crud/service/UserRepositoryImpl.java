package com.reeves.crud.service;

import com.reeves.crud.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.sql.SQLException;
import java.util.List;

public class UserRepositoryImpl extends HibernateDaoSupport implements UserRepository {

    public List<User> list() {
        final String query = "Select u from User u order by u.id desc";
        return (List<User>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
        });
    }

    public void add(User user) {
        getHibernateTemplate().save(user);
    }

    public User load(Long id) {
        return getHibernateTemplate().load(User.class, id);
    }

    public void update(User user) {
        getHibernateTemplate().update(user);
    }

    public void delete(Long id) {
        getHibernateTemplate().delete(load(id));
    }
}
