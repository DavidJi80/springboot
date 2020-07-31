package com.github.davidji80.springboot.redis.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "redisCache")
public class CacheService {
    @Cacheable(
            cacheNames = {"redisCache","otherCache"},
            key = "#value",
            condition = "#value.length()<4",
            unless = "#result.length()>=4")
    public String cacheable(String value){
        return value;
    }

    @CachePut(value = "redisCache",key = "#value")
    public String cachePut(String value){
        return "cachePut:"+value;
    }

    @CacheEvict(value = "redisCache",
            key = "#value")
    public String cacheEvict(String value){
        return "cacheEvict:"+value;
    }

    @CacheEvict(cacheNames = {"redisCache","otherCache"},
            allEntries = true)
    public void cacheAllEvict(){

    }

}
