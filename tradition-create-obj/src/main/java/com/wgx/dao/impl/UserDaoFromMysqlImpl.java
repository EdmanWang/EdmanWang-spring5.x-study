package com.wgx.dao.impl;

import com.wgx.dao.UserDao;

public class UserDaoFromMysqlImpl implements UserDao {
    public void query() {
        System.out.println("------从mysql数据库中获取数据--------");
    }
}
