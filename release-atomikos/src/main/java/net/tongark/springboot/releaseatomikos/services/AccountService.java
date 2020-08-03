package net.tongark.springboot.releaseatomikos.services;


import net.tongark.springboot.releaseatomikos.entities.Account;

import java.util.List;

public interface  AccountService {
    List findAll();
    void addAccount(Account account);
}
