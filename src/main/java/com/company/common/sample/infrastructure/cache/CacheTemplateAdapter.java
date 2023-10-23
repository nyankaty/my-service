package com.company.common.sample.infrastructure.cache;

import com.company.common.redis.implementation.RedisCacheTemplate;
import com.company.common.redis.port.CacheTemplate;
import org.springframework.stereotype.Component;

@Component
public class CacheTemplateAdapter extends RedisCacheTemplate implements CacheTemplate {

}
