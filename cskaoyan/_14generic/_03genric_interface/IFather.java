package com.cskaoyan._14generic._03genric_interface;

// 把泛型加在接口上
public interface IFather<T> {
    T getData(T t);
}
// 没指明泛型 ---> 默认是Object
class Son implements IFather{


    @Override
    public Object getData(Object o) {
        return null;
    }
}
// 父类指明泛型
class Son2 implements IFather<String>{


    @Override
    public String getData(String s) {
        return null;
    }
}

// 定义子类的时候也定义了泛型
class Son3<E> implements IFather<String> {

    @Override
    public String getData(String s) {
        return null;
    }
}

class Son4<T> implements IFather<T>{

    @Override
    public T getData(T t) {
        return null;
    }
}


class Son5<T> implements IFather{

    @Override
    public Object getData(Object o) {
        return null;
    }
}