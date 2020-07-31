package net.tongark.springboot.releasesqljdbc.controllers;

import net.tongark.springboot.releasesqljdbc.entities.Account;
import net.tongark.springboot.releasesqljdbc.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/add/{name}")
    public void addAccount(@PathVariable String name){
        Account account=new Account();
        account.setName(name);
        accountService.addAccount(account);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List findAll(){
        return accountService.findAll();
    }
}
