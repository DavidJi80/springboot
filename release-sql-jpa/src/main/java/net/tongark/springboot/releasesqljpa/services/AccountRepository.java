package net.tongark.springboot.releasesqljpa.services;

import net.tongark.springboot.releasesqljpa.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承了JpaRepository，
 * 由于只是介绍了jpa的简单功能，所以JpaRepository中内置的方法已经足够使用
 */
public interface AccountRepository extends JpaRepository<Account,Long> {
}
