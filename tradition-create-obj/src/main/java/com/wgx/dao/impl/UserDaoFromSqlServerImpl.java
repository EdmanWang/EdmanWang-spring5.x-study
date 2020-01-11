package com.wgx.dao.impl;

import com.wgx.dao.UserDao;

public class UserDaoFromSqlServerImpl implements UserDao {
    public void query() {
        System.out.println("------从SqlServer数据库中获取数据--------");
    }
}
