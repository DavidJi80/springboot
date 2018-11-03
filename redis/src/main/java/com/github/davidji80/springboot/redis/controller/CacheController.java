package com.github.davidji80.springboot.redis.controller;

import com.github.davidji80.springboot.redis.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
    @Autowired
    CacheService cacheService;

    @RequestMapping("/CachePut/{value}")
    public String cachePut(@PathVariable String value) {
        return cacheService.cachePut(value);
    }

    @RequestMapping("/Cacheable/{value}")
    public String cacheable(@PathVariable String value) {
        return cacheService.cacheable(value);
    }

    @RequestMapping("/CacheEvict/{value}")
    public String cacheEvict(@PathVariable String value) {
        return cacheService.cacheEvict(value);
    }

}
