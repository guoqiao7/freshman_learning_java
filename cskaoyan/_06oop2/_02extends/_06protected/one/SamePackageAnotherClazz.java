package com.cskaoyan._06oop2._02extends._06protected.one;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 16:21
 **/
// 同包非子类
public class SamePackageAnotherClazz {
    public static void main(String[] args) {
        // 创建父类对象访问
        CurrentClazz currentClazz = new CurrentClazz();
        System.out.println(currentClazz.a);

        // 创建子类对象访问
        SamePackageSonClazz samePackageSonClazz = new SamePackageSonClazz();
        System.out.println(samePackageSonClazz.a);
        // 创建"兄弟"对象访问
        SamePackageSonClazz2 samePackageSonClazz2 = new SamePackageSonClazz2();
        System.out.println(samePackageSonClazz2.a);
    }
}
