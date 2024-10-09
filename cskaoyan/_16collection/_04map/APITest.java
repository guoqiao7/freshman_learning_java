package com.cskaoyan._16collection._04map;

import org.junit.Test;

import java.util.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 15:42
 **/
/*
1. Map是Map集合体系的顶级接口
2. Map是一个存储映射数据(key-value; 键值对)的数据容器
3. Map的一些子实现有序, 一些子实现存储数据无序: (指key)
4. Map不允许存储重复数据: (指key)
5. Map的一些子实现允许存储null, Map的一些子实现不允许存储null: (指key)
注意:
注意: Map没有办法'直接'使用foreach循环,
因为Map和Collection不一样( Collection<E> extends Iterable<E>),
Map从接口名上不是Iterable子接口 (也就意味着Map接口不具有Iterator方法).
 */
public class APITest {
    // ----添加删除相关----------------
//        V put(K key, V value): 添加方法
//        void putAll(Map<? extends K,? extends V> m): 添加所有
//        V remove(Object key): 根据key删除键值对
//        V get(Object key): 根据key获取key对应value
//        boolean containsKey(Object key): 查找key是否存在
//        boolean containsValue(Object value): 查找value是否存在
    // -----辅助方法------------------
//        int size()
//        返回此映射中的键-值映射关系数。
//        int hashCode()
//        返回此映射的哈希码值。
//        boolean isEmpty()
//        如果此映射未包含键-值映射关系，则返回 true。
//        boolean equals(Object o)
//        比较指定的对象与此映射是否相等。
//        void clear()
//        从此映射中移除所有映射关系（可选操作）。

    @Test
    public void test1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zs", 20);
        map.put("zs", 20);
        map.put("ls", 30);
        System.out.println(map);
        // -----特殊方法(在实际使用的时候,主要是用来帮助我们遍历Map数据)-------
        // Set<K> keySet()
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 返回此映射中包含的键的 Set 视图。
        // Collection<V> values()
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        // 返回此映射中包含的值的 Collection 视图。
        // Set<Map.Entry<K,V>> entrySet()
        // 返回此映射中包含的映射关系的 Set 视图。
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);
    }
}
