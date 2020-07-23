package net.tongark.springboot.releasesqljooq.controllers;

import net.tongark.springboot.releasesqljooq.generated.tables.pojos.Account;
import net.tongark.springboot.releasesqljooq.services.AccountService;
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
        accountService.add(account);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List findAll(){
        return accountService.findAll();
    }

    @GetMapping("/update/{id}/{name}")
    public int updateAccount(@PathVariable int id,@PathVariable String name){
        Account account=new Account();
        account.setId(id);
        account.setName(name);
        return accountService.update(account);
    }

    @GetMapping("/delete/{id}")
    public void deleteAccount(@PathVariable int id){
        accountService.delete(id);
    }
}
