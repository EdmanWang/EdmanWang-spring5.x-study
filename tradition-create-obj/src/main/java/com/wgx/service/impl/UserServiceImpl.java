package com.wgx.service.impl;

import com.wgx.dao.UserDao;
import com.wgx.dao.impl.UserDaoFromMysqlImpl;
import com.wgx.service.UserService;

public class UserServiceImpl implements UserService {

    // 这种方式的主动权在程序员，不利于业务的扩展
    // private UserDao userDao = new UserDaoFromMysqlImpl();

    private UserDao userDao;

    /**
     * 在构造函数中进行注入，或者创建一个接口，动态的设置值
     * 这种方式：就是将创建的主动权交给了使用者。
     *
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void quey() {
        userDao.query();
    }
}
