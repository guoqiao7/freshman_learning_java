package com.cskaoyan._15ds._01basic._03link.ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 9:40
 **/
// 判断链表中是否有环
public class Ex1 {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        // 构建链表
        // a--->b--->c---d--->e--->f
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = f;

        //a--->b--->c---d--->e--->f--->c
        // 成环
        f.next = c;
        boolean isCircle = hasCircle(a);
        System.out.println(isCircle);

        Node startNode = getCircleStartNode(a);
        System.out.println(startNode.value);
    }

    private static Node getCircleStartNode(Node head) {
        // 定义2个指针
        Node rabbit = head;
        Node turtle = head;
        // 循环
        while (rabbit.next != null && rabbit.next.next != null){
            // 快指针移动2步
            rabbit = rabbit.next.next;
            // 满指针移动1步
            turtle = turtle.next;
            if (rabbit == turtle) {
                break;
            }
        }
        // 执行到这里 说明相遇
        // 修改慢指针 重写移动回head位置
        turtle = head;
        while (turtle != rabbit) {
            turtle = turtle.next;
            rabbit = rabbit.next;
        }
        // 循环结束--->再次相遇
        return turtle;
    }

    private static boolean hasCircle(Node head) {
        // 使用Floyd方法(快慢指针法)
        // 定义2个指针 一个快  一个慢
        Node rabbit = head;
        Node turtle = head;
        // 循环
        while (rabbit.next.next != null && rabbit.next != null) {
            // 快指针移动2下
            rabbit = rabbit.next.next;
            // 慢指针移动一下
            turtle= turtle.next;
            // 如果相遇 说明有环
            if (rabbit == turtle) {
                return true;
            }
        }
        return false;
    }
}
