package com.baidu.service.impl;

import com.baidu.dao.AccountDao;
import com.baidu.po.Account;
import com.baidu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> find() {
        return accountDao.find();
    }

    @Override
    public void add(Account account) {
        accountDao.add(account);
    }
}
