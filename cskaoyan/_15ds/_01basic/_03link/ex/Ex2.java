package com.cskaoyan._15ds._01basic._03link.ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 10:27
 **/
// 实现链表的逆序

public class Ex2 {
    public static void main(String[] args) {
        Node head = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");

        head.next = b;
        b.next = c;
        c.next = d;
        // A--->B--->C--->D
        print(head);
        // D--->C---B---A
        // 递归实现逆序
        //Node newHead = reverse(head);
        //print(newHead);
        System.out.println();
        // 非递归的逆序
        Node newHead = reverse2(head);
        print(newHead);
    }

    private static Node reverse2(Node head) {
        // 定义一个当前节点作为遍历节点
        Node current = head;
        // 定义next 记录当前节点的下个节点
        Node next = null;
        // 定义pre 保存当前节点的上个节点
        Node pre = null;
        // 遍历
        while (current != null) {
            // 记录一下当前节点下个节点
            next = current.next;
            // 反转
            current.next = pre;
            // 更新pre 让当前节点作为新的pre
            pre = current;
            // 更新current 当前节点后移 遍历下个节点
            current = next;
        }
        // 返回逆序后的头节点
        return pre;
    }

    private static Node reverse(Node node) {
        // 递归实现
        // 递归结束条件 出口
        if (node == null || node.next == null) {
            return node;
        }
        // 如果不是最后一个节点 递归下个节点
        Node newNode = reverse(node.next);
        // 递归后的处理
        // 逆序
        // 修改next
        node.next.next = node;
        node.next = null;
        // 返回逆序后的头节点
        return newNode;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.value+" ");
            // head后移
            head = head.next;
        }
    }
}
