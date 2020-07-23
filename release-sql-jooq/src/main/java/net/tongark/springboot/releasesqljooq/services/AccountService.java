package net.tongark.springboot.releasesqljooq.services;

import net.tongark.springboot.releasesqljooq.generated.tables.pojos.Account;

import java.util.List;

public interface AccountService {
    //C
    public void add(Account account);

    //R
    public List<Account> findAll();

    //U
    public int update(Account account);

    //D
    public void delete(int id);

}
