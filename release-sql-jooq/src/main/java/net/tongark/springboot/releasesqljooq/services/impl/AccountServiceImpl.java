package net.tongark.springboot.releasesqljooq.services.impl;

import net.tongark.springboot.releasesqljooq.generated.tables.TAccount;
import net.tongark.springboot.releasesqljooq.generated.tables.pojos.Account;
import net.tongark.springboot.releasesqljooq.services.AccountService;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    DSLContext dsl;

    TAccount ACCOUNT = TAccount.T_ACCOUNT;

    @Override
    public void add(Account account) {
        dsl.insertInto(ACCOUNT)
                .columns(ACCOUNT.NAME)
                .values(account.getName())
                .execute();
    }

    @Override
    public List<Account> findAll() {
        return dsl.select().from(ACCOUNT).fetchInto(Account.class);
    }

    @Override
    public int update(Account account) {
        dsl.update(ACCOUNT).set((Record) account);
        return account.getId();
    }

    @Override
    public void delete(int id) {
        dsl.delete(ACCOUNT).where(ACCOUNT.ID.eq(id)).execute();
    }

}
