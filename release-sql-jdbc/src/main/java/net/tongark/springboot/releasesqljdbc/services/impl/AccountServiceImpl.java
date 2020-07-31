package net.tongark.springboot.releasesqljdbc.services.impl;

import net.tongark.springboot.releasesqljdbc.entities.Account;
import net.tongark.springboot.releasesqljdbc.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List findAll() {
        String sql = "select * from t_account";
        List list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    @Transactional
    public void addAccount(Account account) {
        String sql = "insert into t_account(name) values(?)";
        jdbcTemplate.update(sql, account.getName());
//        throw new RuntimeException("事务异常，回滚!");
    }
}
