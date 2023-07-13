package com.company.sample.core.port.internalcache;

import java.util.Set;

/**
 * Interface để sử dụng internal cache (mem cache)
 */
public interface InternalCacheTemplate {

    /**
     * Lấy value từ cache
     * @param key key
     * @return    value
     */
    Object get(String key);

    /**
     * Lưu value vào cache
     * @param key    key
     * @param value  value
     */
    void put(String key, Object value);

    /**
     * Xóa key và value trong cache
     * @param key key
     */
    void invalidate(String key);

    /**
     * Xóa tất cả dữ liệu trong cache
     */
    void clear();

    /**
     * Lấy tập hợp các key
     * @return Set gồm các key
     */
    Set<Object> keySet();
}

