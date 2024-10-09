package com.cskaoyan._12io._01bytestream._01out;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 10:15
 **/
/*
验证try-with-resources自动释放资源
 */
public class Demo6 {
    public static void main(String[] args) {
        try (A a = new A()){
            // 调用func方法
            a.func();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class A implements AutoCloseable{
    public void func() {
        System.out.println("func方法执行了");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close方法自动执行了");
    }
}