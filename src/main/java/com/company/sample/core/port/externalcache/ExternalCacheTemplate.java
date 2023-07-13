package com.company.sample.core.port.externalcache;

import java.util.List;
import java.util.Set;

/**
 * Interface để sử dụng cache server
 */
public interface ExternalCacheTemplate {

    <T> T getObject(String cacheName, String key, Class<T> objectClass);

    <T> T getObject(String key, Class<T> objectClass);

    <T> List<T> getObjectAsList(String cacheName, String key, Class<T> objectClass);

    <T> T getObjectFromList(String cacheName, String key, Class<T> objectClass);

    <T> T getObjectFromList(String key, Class<T> objectClass);

    <T> List<T> getObjectAsList(String key, Class<T> objectClass);

    <T> String putObject(String cacheName, String key, T value);

    <T> String putObject(String key, T value);

    <T> String putObjectAsList(String cacheName, String key, List<T> valueList);

    <T> String putObjectAsList(String key, List<T> value);

    <T> String putObjectToList(String cacheName, String key, T value);

    <T> String putObjectToList(String key, T value);

    boolean hasKey(String cacheName, String key);

    boolean hasKey(String key);

    /**
     * Xóa đi applicationShortName::cacheName::key và value của nó trong cache
     *
     * @param cacheName
     * @param key
     */
    void invalidate(String cacheName, String key);

    void invalidate(String key);


    /**
     * Lấy ra tập hợp các key còn hiệu lực trong cache
     *
     * @param keyPattern REGEX của key
     * @param count      số lượng key cần lấy
     * @return tập hợp có count phần tử thỏa mãy keyPattern
     */
    Set<String> keySet(String keyPattern, long count);
}

