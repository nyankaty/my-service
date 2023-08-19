package com.company.common.sample.infrastructure.internalcache;

import com.company.common.cache.internal.implementation.CaffeineCacheTemplate;
import com.company.common.cache.internal.port.InternalCacheTemplate;
import org.springframework.stereotype.Component;

@Component
public class InternalCacheTemplateAdapter extends CaffeineCacheTemplate implements InternalCacheTemplate {

}
