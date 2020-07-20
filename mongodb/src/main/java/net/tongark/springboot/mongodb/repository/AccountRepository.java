package net.tongark.springboot.mongodb.repository;

import net.tongark.springboot.mongodb.dto.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,Long> {
}
