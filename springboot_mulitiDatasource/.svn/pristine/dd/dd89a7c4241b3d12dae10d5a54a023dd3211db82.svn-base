package com.wj.demo.service.impl;

import com.wj.demo.dao.datasource1Dao.UserDao;
import com.wj.demo.entity.User;
import com.wj.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
