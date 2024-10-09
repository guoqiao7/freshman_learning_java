package com.cskaoyan._06oop2._02extends._06protected.another;

import com.cskaoyan._06oop2._02extends._06protected.one.CurrentClazz;
import com.cskaoyan._06oop2._02extends._06protected.one.SamePackageSonClazz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 16:27
 **/
// 不同包非子类
// ----> 都不能访问protected成员
public class AnotherPackageAnotherClazz {
    public static void main(String[] args) {
        // 创建父类对象访问
        CurrentClazz currentClazz = new CurrentClazz();
        // 'a' has protected access in 'com.cskaoyan._06oop2._02extends._06protected.one.C
        // System.out.println(currentClazz.a);

        // 创建子类对象访问
        AnotherPackageSonClazz anotherPackageSonClazz = new AnotherPackageSonClazz();
        // a' has protected access in
        // System.out.println(anotherPackageSonClazz.a);

        // 创建兄弟对象访问
        SamePackageSonClazz samePackageSonClazz = new SamePackageSonClazz();
        // System.out.println(samePackageSonClazz.a);
    }
}
