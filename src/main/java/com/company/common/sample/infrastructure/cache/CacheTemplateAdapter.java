package com.company.common.sample.infrastructure.cache;

import com.company.common.cache.external.implementation.RedisCacheTemplate;
import com.company.common.cache.external.port.CacheTemplate;
import org.springframework.stereotype.Component;

@Component
public class CacheTemplateAdapter extends RedisCacheTemplate implements CacheTemplate {

}
