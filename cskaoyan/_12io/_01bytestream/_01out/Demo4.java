package com.cskaoyan._12io._01bytestream._01out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 10:04
 **/
/*
异常处理:
1.try-catch-finally
2.try-with-resources
 */
public class Demo4 {
    public static void main(String[] args) {
        // 创建输出流对象
        FileOutputStream out = null;
        try {
            // do sth ....
            //可能出现异常的代码
            out = new FileOutputStream("a.txt");
            // write
            out.write("abcd".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            // close
            try {
                // 判断是否为null
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
