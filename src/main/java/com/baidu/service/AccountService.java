package com.baidu.service;

import com.baidu.po.Account;

import java.util.List;

public interface AccountService {
    List<Account> find();
    void add(Account account);
}
