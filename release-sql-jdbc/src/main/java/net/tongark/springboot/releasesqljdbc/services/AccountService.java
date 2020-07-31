package net.tongark.springboot.releasesqljdbc.services;

import net.tongark.springboot.releasesqljdbc.entities.Account;

import java.util.List;

public interface  AccountService {
    List findAll();
    void addAccount(Account account);
}
