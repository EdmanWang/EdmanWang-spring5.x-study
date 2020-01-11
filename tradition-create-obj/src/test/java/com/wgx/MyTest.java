package com.wgx;

import com.wgx.dao.impl.UserDaoFromSqlServerImpl;
import com.wgx.service.impl.UserServiceImpl;

public class MyTest {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoFromSqlServerImpl());
        userService.quey();
    }
}
