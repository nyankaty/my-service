package com.company.common.sample.infrastructure.externalcache;

import com.company.common.cache.external.implementation.RedisCacheTemplate;
import com.company.common.cache.external.port.ExternalCacheTemplate;
import org.springframework.stereotype.Component;

@Component
public class ExternalCacheTemplateAdapter extends RedisCacheTemplate implements ExternalCacheTemplate {

}
