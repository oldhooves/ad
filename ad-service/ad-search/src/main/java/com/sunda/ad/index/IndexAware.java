package com.sunda.ad.index;

/**
 * Created by 老蹄子 on 2019/5/31 下午8:47
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
