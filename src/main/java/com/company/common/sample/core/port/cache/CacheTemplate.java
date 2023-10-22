package com.company.common.sample.core.port.cache;

import java.time.Duration;

/**
 * Interface để sử dụng cache server
 */
public interface CacheTemplate {

    <T> T getObject(String key);

    <T> T getObject(String cacheName, String key);

    void putObject(String cacheName, String key, Object value);

    void putObject(String key, Object value);

    void putObject(String cacheName, String key, Object value, Duration duration);

    void putObject(String key, Object value, Duration duration);

    boolean hasKey(String cacheName, String key);

    boolean hasKey(String key);

    void invalidate(String cacheName, String key);

    void invalidate(String key);
}

