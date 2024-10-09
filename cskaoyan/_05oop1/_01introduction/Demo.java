package com.cskaoyan._05oop1._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 10:33
 **/
/*
张三养了3只狗，一只1岁白色萨摩亚，一只2岁黄白柯基，一只3岁黄色金毛

解决方案:
- 单独变量模拟
- 数组方式模拟
 */
public class Demo {
    public static void main(String[] args) {
        // 使用单独变量的方式描述
        // 第一只狗的信息
        String dog1Name = "萨摩耶";
        int dog1Age = 1;
        String dog1Color = "白色";

        // 第二只狗的信息
        String dog2Name = "柯基";
        int dog2Age = 2;
        String dog2Color = "黄白色";


        // 第三只狗的信息
        String dog3Name = "金毛";
        int dog3Age = 3;
        String dog3Color = "黄色";


        System.out.println("第一只狗的信息: 名字: " + dog1Name +
                "年龄: " + dog1Age + "颜色: " + dog1Color);
        System.out.println("第二只狗的信息: 名字: " + dog2Name +
                "年龄: " + dog2Age + "颜色: " + dog2Color);
        System.out.println("第三只狗的信息: 名字: " + dog3Name +
                "年龄: " + dog3Age + "颜色: " + dog3Color);

        // 操作这些变量比较繁琐 不方便数据管理
        // ---->使用数组
        String[] dog1 = new String[3];
        String[] dog2 = new String[3];
        String[] dog3 = new String[3];
        dog1[0] = "萨摩耶";
        dog1[1] = "1";
        dog1[2] = "白色";

        dog2[0] = "柯基";
        dog2[1] = "2";
        dog2[2] = "黄白色";


        dog3[0] = "金毛";
        dog3[1] = "3";
        dog3[2] = "黄色";
        System.out.println("------------");
        System.out.println("第一只狗的信息: 名字: " + dog1[0] +
                "年龄: " + dog1[1] + "颜色: " + dog1[2]);
        System.out.println("第二只狗的信息: 名字: " + dog2[0] +
                "年龄: " + dog2[1] + "颜色: " + dog2[2]);
        System.out.println("第三只狗的信息: 名字: " + dog3[0] +
                "年龄: " + dog3[1] + "颜色: " + dog3[2]);

        // 为了解决上述问题, 我们引入了类与对象.

    }
}
