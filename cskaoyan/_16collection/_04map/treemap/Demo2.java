package com.cskaoyan._16collection._04map.treemap;

import java.util.TreeMap;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 17:12
 **/

public class Demo2 {
    public static void main(String[] args) {
        TreeMap<User, Integer> treeMap = new TreeMap<>();
        User user1 = new User("zs", 20);
        User user2 = new User("ls", 18);
        User user3 = new User("ww", 22);
        treeMap.put(user1, 1);
        treeMap.put(user2, 2);
        treeMap.put(user3, 3);
        System.out.println(treeMap);
    }
}
class User implements Comparable<User>{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
