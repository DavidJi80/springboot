package net.tongark.springboot.mongodb.controllers;

import net.tongark.springboot.mongodb.dto.Account;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private static final Log log = LogFactory.getLog(AccountController.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/add/{name}")
    public void addAccount(@PathVariable String name){
        Account account=new Account();
        account.setId((long) 1);
        account.setName(name);
        mongoTemplate.insert(account);
        log.info("插入成功！");
    }
}
