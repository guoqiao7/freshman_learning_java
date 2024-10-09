package com.cskaoyan._12io._01bytestream._01out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 10:10
 **/
/*
try-with-resources
try(资源 实现了AutoCloseable接口的类){
    // 可能出现异常的代码
    // 出了try之后 会自动的close
}catch(){
}catch(){
}
 */
public class Demo5 {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("a.txt")){
           // 可能出现异常的代码
           // write写数据
           out.write("aaa".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
