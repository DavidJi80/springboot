package net.tongark.springboot.releaseatomikos.services.impl;

import net.tongark.springboot.releaseatomikos.entities.Account;
import net.tongark.springboot.releaseatomikos.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //@Resource(name = "ds2JdbcTemplate")
    @Autowired
    @Qualifier(value = "ds2JdbcTemplate")
    private JdbcTemplate jdbcTemplate2;

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
        jdbcTemplate2.update(sql, account.getName());
//        throw new RuntimeException("事务异常，回滚!");
    }
}
