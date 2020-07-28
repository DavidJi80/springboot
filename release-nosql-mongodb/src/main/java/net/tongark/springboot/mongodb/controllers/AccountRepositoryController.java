package net.tongark.springboot.mongodb.controllers;

import net.tongark.springboot.mongodb.dto.Account;
import net.tongark.springboot.mongodb.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account_repo")
public class AccountRepositoryController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/add/{name}")
    public Account addAccount(@PathVariable String name){
        Account account=new Account();
        long radomID = (long) (Math.random()*1000000000);
        account.setId(radomID);
        account.setName(name);
        accountRepository.save(account);
        return account;
    }

    @GetMapping("accounts")
    public List<Account> getAccountList(){
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        accountRepository.deleteById(id);
        return "success";
    }
}
