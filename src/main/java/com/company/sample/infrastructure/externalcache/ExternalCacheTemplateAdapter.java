package com.company.sample.infrastructure.externalcache;

import com.company.common.cache.external.implementation.RedisCacheTemplate;
import com.company.common.cache.external.port.ExternalCacheTemplate;
import com.company.common.cache.external.properties.RedisCacheConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class ExternalCacheTemplateAdapter extends RedisCacheTemplate implements ExternalCacheTemplate {

    public ExternalCacheTemplateAdapter(RedisCacheConfigurationProperties externalCacheProp) {
        super(externalCacheProp);
    }
}
