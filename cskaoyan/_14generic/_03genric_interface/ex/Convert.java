package com.cskaoyan._14generic._03genric_interface.ex;

/*
转换器 初入一个类型的参数  返回另一个类型的结果
 */
public interface Convert<T,R> {
    // 传入方法的值T类型
    // do sth
    // 返回一个R类型的结果
    R convert(T t);
}
