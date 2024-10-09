package com.cskaoyan._06oop2._02extends._11override._03override;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 10:49
 **/
/*
方法重写的时候 注意:
1. 子类中重写的方法，访问权限等级，必须至少保持一致，可以更为宽松，
但一定不能更严格。
2. 子类中重写的方法，返回值类型必须和原先父类方法的返回值类型，保持兼容。
3. 子类中重写的方法，方法名必须严格保持一致，不能做任何修改。
4. 子类中重写的方法，形参列表必须保持严格一致，不能做任何修改。
5. 方法体的代码，无所谓，可以保持一致，也可以修改。

特殊的
- 父类中私有方法不能被重写（因为没有权限访问，更不谈重写）
- 静态方法在使用现象上，很像是被重写了，但实际上静态方法不能被重写，而是直接是一个新的静态成员。（使用`@Override`注解标记会报错）
- 构造器不能继承，更不能被重写。
 */
public class Demo2 {
    public static void m() {

    }

    public static void m(int a) {

    }

    public static void m(String a) {

    }
}

class Father2{
    void m1() {

    }

    public int m2() {
        return 1;
    }

    public Fruit m3() {
        return new Fruit();
    }

    public Fruit m6() {
        return null;
    }

    public void m4(int a) {

    }

    private void m5() {

    }
}

class Son2 extends Father2{
    // 权限可以更宽松 但是不能更严格
    //@Override
    //private void m1() {
    //
    //}

    @Override
    public void m1() {

    }

    @Override
    public int m2() {
       return 1;
    }

    @Override
    public Fruit m3() {
        // 存在自动类型转换
        // 把苹果当做水果看待
        return new Apple();
    }

    @Override
    public Apple m6() {
        return null;
    }

    // Method does not override method from its superclass
    //@Override
    //public void m4() {
    //
    //}

    // 私有方法不能重写
    //@Override
    //public void m5() {
    //
    //}
}

class Fruit{

}

class Apple extends Fruit{

}