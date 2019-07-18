package com.baidu.dao;

import com.baidu.po.Account;

import java.util.List;

public interface AccountDao {

    List<Account> find();
    void add(Account account);

}
