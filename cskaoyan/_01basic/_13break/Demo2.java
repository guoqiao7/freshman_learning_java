package com.cskaoyan._01basic._13break;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 8:53
 **/

/*
label:for(){
    label2:for(){
        label3:for(){
            //break label
        }
    }
}
 */
public class Demo2 {
    public static void main(String[] args) {
        lable1:for (int i = 0; i < 3; i++) {
            lable2:for (int j = 0; j < 3; j++) {
                lable3:for (int k = 0; k < 3; k++) {
                    if (k == 1) {
                        System.out.println(k);
                        break lable1;
                    }
                }
            }
        }
    }
}
