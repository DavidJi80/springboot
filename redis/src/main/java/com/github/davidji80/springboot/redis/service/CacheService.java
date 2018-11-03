package com.github.davidji80.springboot.redis.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    @Cacheable(value = "redisCache",key = "#value")
    public String cacheable(String value){
        return "cacheable:"+value;
    }

    @CachePut(value = "redisCache",key = "#value")
    public String cachePut(String value){
        return "cachePut:"+value;
    }

    @CacheEvict(value = "redisCache",key = "#value")
    public String cacheEvict(String value){
        return "cacheEvict:"+value;
    }

}
