package net.tongark.springboot.releasesqljpa.controllers;

import net.tongark.springboot.releasesqljpa.entities.Account;
import net.tongark.springboot.releasesqljpa.services.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/add/{name}")
    public void addAccount(@PathVariable String name){
        Account account=new Account();
        account.setName(name);
        accountRepository.save(account);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List findAll(){
        return accountRepository.findAll();
    }

    @GetMapping(value = "delete/{id}")
    public String deleteCity(@PathVariable Long id){
        accountRepository.deleteById(id);
        return "success";
    }
}
