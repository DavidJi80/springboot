package com.github.davidji80.springboot.mybatis.esdao;

import com.github.davidji80.springboot.mybatis.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends ElasticsearchRepository<User,Integer> {
}
