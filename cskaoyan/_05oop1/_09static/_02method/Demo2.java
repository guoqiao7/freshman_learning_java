package com.cskaoyan._05oop1._09static._02method;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 15:41
 **/
/*

注意事项:
1. 一个类中，静态方法无法直接调用非静态的方法和属性，也不能使用this，super关键字（super后面会讲）,静态的方法只能访问静态的
2. 经典错误：Non-static field/method xxx cannot be referenced from a static context
3. 原因：静态方法调用的时候，完全有可能没有对象，没有对象普通成员就无法访问。
4. 普通成员方法当中，既可以访问静态成员的, 也可以访问非静态成员。普通成员方法访问任意的
5. 访问静态成员变量的时候，使用类名.变量名的形式访问，以示区别，增加代码可读性
 */
public class Demo2 {
    int a =1;
    static int b = 2;
    public void normalMethod() {
        // 在非静态方法里面可以访问静态的东西
        System.out.println(b);
        // 习惯通过类名.静态成员方法
        System.out.println(Demo2.b);
        staticMethod();
        Demo2.staticMethod();
        // 原因 : 静态的东西是属于类的, 随着类的加载而加载

        System.out.println(a);
    }

    public static void staticMethod() {
        // Non-static method 'normalMethod()' cannot be referenced from a static context
        //normalMethod();
        //System.out.println(a);
        //  System.out.println(this);
        // 静态方法无法访问非静态的东西
        // 非静态的东西依赖于对象的
        // 也不能使用this
        // 可以通过创建对象 间接访问
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.a);
        demo2.normalMethod();

        //Modifier 'static' not allowed here
        // static int a = 1;

    }

    public static void m3() {
        System.out.println("Demo2  m3()");
    }
}
