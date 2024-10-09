package com.cskaoyan._16collection._04map.properties;

import javax.naming.Name;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 16:58
 **/

public class Demo {
    public static void main(String[] args) throws IOException {
        // 使用properties来保存或者读取k-v数据
        // 创建Properties对象
        Properties properties = new Properties();
        // 从流中加载配置文件
        // load(Inputstream in)
        properties.load(new FileInputStream("config.properties"));

        // 读取配置信息 通过key来获取value值
        // getProperty(String key)
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println(name);
        System.out.println(password);

        // 通过java代码连接数据库
        // url = jdbc:mysql://localhost:3306
        // DriverManager.getConnection()

    }
}
