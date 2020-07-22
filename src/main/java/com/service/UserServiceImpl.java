package com.service;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    @Transactional
    public List<User> findAll() {
        List<User> all = dao.findAll();
        System.out.println("查询了全部");
        return all;
    }

    @Override
    @Transactional
    public void save(User user) {
        dao.save(user);
        System.out.println("保存了用户");

    }
}
