package com.baidu.controller;


import com.baidu.po.Account;
import com.baidu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService ;

    @RequestMapping("/demo.do")
    public String toDemo(Model model){
        List<Account> accountList = accountService.find();

        model.addAttribute("accountList", accountList);

        return "demo";
    }

    @RequestMapping("/toadd.do")
    public String toadd(){

        return "add";
    }

    @RequestMapping("/add.do")
    public String add(Account account){

        accountService.add(account);
        return "forward:/demo.do";
    }


}
