package com.cskaoyan._08object._01getclazz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 8:58
 **/

public class Demo2 {
    public static void main(String[] args) {
        Person person = new Person();

        Teacher teacher = new Teacher();

        Class c1 = person.getClass();
        Class c2 = teacher.getClass();
        System.out.println(c1 == c2);

        boolean result = judgeType(person, teacher);
        System.out.println(result);
    }

    public static boolean judgeType(Object o1, Object o2) {
        return o1.getClass() == o2.getClass();
    }
}

class Person{

}
class Teacher extends Person{

}