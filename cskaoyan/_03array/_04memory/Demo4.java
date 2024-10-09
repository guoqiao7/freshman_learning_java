package com.cskaoyan._03array._04memory;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 15:56
 **/
/*
堆上对象中的变量具有默认值:
1. 整形（byte、short、int、long）默认值为0
2. 浮点类型（float、double）默认值为0.0
3. 字符类型（char）默认值是'\u0000' 表示编码值为0的字符，一个绝对空字符。''
4. 布尔类型（boolean）默认值是false
5. 引用数据类型默认值是null
  - null既不是对象也不是任何一种数据类型，它仅是一个特殊的值
  - 任何引用数据类型的引用都可以指向null，指向null并不意味着没有初始化，可以认为引用指向了虚无，反正没有指向任何一个对象。
  - 对象才是引用数据类型的实质，没有指向对象的引用实际上没有任何意义，指向null的引用是无法正常使用的！
  - 基本数据类型不能等于null
 */
public class Demo4 {
    public static void main(String[] args) {
        //int a;
        //System.out.println(a);

        // 基本数据类型
        int[] arr1 = new int[3];
        double[] arr2 = new double[3];
        char[] arr3 = new char[3];
        boolean[] arr4 = new boolean[2];

        // 引用数据类型
        // 默认值是null
        String[] arr5 = new String[3];

        Student[] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        // null 是引用数据类型的特殊取值
        //arr1 = null;
        //int a = null;

    }
}
class Student{

}