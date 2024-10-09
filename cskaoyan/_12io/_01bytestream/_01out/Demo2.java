package com.cskaoyan._12io._01bytestream._01out;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 9:33
 **/
/*

 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
          文件是否存在,如果不存在 先创建 再写入
          如果文件已经存在,会覆盖掉之前的数据 重新开始写

          如果不想被覆盖--->使用带append的构造器
         */
        FileOutputStream out = new FileOutputStream("a.txt",true);
        // write
        out.write("yyyy".getBytes());

        // close
        out.close();

    }
}
