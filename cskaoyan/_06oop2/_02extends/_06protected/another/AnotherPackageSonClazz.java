package com.cskaoyan._06oop2._02extends._06protected.another;

import com.cskaoyan._06oop2._02extends._06protected.one.CurrentClazz;
import com.cskaoyan._06oop2._02extends._06protected.one.SamePackageSonClazz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 16:26
 **/
// 不同包的子类  只有创建子类对象才能访问
public class AnotherPackageSonClazz extends CurrentClazz {
    public static void main(String[] args) {
        // 创建父类对象访问
        CurrentClazz currentClazz = new CurrentClazz();
        // 'a' has protected access in 'com.cskaoyan._06oop2._02extends._06protected.one.C
        // System.out.println(currentClazz.a);

        // 创建子类对象访问
        AnotherPackageSonClazz anotherPackageSonClazz = new AnotherPackageSonClazz();
        // a' has protected access in
        System.out.println(anotherPackageSonClazz.a);

        // 创建兄弟对象访问
        SamePackageSonClazz samePackageSonClazz = new SamePackageSonClazz();
        // 'a' has protected access
        // System.out.println(samePackageSonClazz.a);
    }
}
