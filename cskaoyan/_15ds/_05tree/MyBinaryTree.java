package com.cskaoyan._15ds._05tree;

import com.cskaoyan._15ds._03stack.MyArrayStack;
import com.cskaoyan._15ds._04queuq.MyArrayQueue;
import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 17:13
 **/

public class MyBinaryTree {
    // 节点结构
    private class Node{
        // 数据域
        int value;
        // 指针域
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // 递归的遍历
    // 前序遍历
    public static void preOrder(Node node) {
        // 根左右
        // 递归出口
        if (node == null) {
            return;
        }
        // 输出根节点
        System.out.print(node.value+ " ");
        // 递归遍历左子树
        preOrder(node.left);
        // 递归遍历右子树
        preOrder(node.right);

    }

    // 中序遍历
    public static void inOrder(Node node) {
        // 左根右
        if (node == null) {
            return;
        }
        // 递归遍历左子树
        inOrder(node.left);
        // 输出根节点
        System.out.print(node.value+" ");
        // 递归遍历右子树
        inOrder(node.right);
    }

    // 后序遍历
    public static void postOrder(Node node) {
        // 左右根
        // 递归出口
        if (node == null) {
            return;
        }
        // 递归遍历左子树
        postOrder(node.left);
        // 递归遍历右子树
        postOrder(node.right);
        // 输出根节点
        System.out.print(node.value+ " ");
    }

    // 递归序
    public static void find(Node node) {
        // 递归出口
        if (node == null) {
            return;
        }
        System.out.print(node.value+ " ");
        find(node.left);
        System.out.print(node.value+ " ");
        find(node.right);
        System.out.print(node.value+ " ");
        // 递归序
        // 1 2 4 4 4 2 5 5 5 2 1 3 6 6 6 3 7 7 7 3 1
    }

    // 非递归前序遍历
    public static void preOrder2(Node node) {
        if (node != null) {
            // 创建一个栈
            MyArrayStack<Node> stack = new MyArrayStack<>();
            // 根节点入栈
            stack.push(node);
            // 循环执行以下操作
            while (!stack.isEmpty()) {
                // 弹出栈顶元素 打印
                Node popNode = stack.pop();
                System.out.print(popNode.value+ " ");
                // 如果该节点有右子树 右子树入栈
                if (popNode.right != null) {
                    stack.push(popNode.right);
                }
                // 如果该节点有左子树 左子树入栈
                if (popNode.left != null) {
                    stack.push(popNode.left);
                }
            }
        }
    }

    // 非递归中序遍历
    public static void inOrder2(Node node) {
        // 创建一个栈
        MyArrayStack<Node> stack = new MyArrayStack<>();
        // 循环执行以下操作
        while (node != null || !stack.isEmpty()) {
            // 将整个左边界入栈
            if (node != null) {
                stack.push(node);
                node = node.left;
            }else {
                // 如果没有左子树 弹出栈顶元素 打印
                Node popNode = stack.pop();
                System.out.print(popNode.value+" ");
                // 如果该元素有右子树 将右子树的整个左边界入栈
                node = popNode.right;
            }

        }
    }

    // 非递归后续遍历 借助2个栈
    public static void postOrder2(Node node) {
        if (node != null) {
            // 创建一个栈用于遍历  s1
            MyArrayStack<Node> s1 = new MyArrayStack<>();
            // 再创建一个栈用于保存结果 作为辅助栈  s2
            MyArrayStack<Node> s2 = new MyArrayStack<>();
            // 根节点入栈 s1
            s1.push(node);
            // 循环执行
            while (!s1.isEmpty()) {
                // 弹出栈顶元素 不打印  入栈s2
                Node popNode = s1.pop();
                s2.push(popNode);
                // 如果该节点有左子树 将左子树入栈s1
                if (popNode.left != null) {
                    s1.push(popNode.left);
                }
                // 如果该节点有右子树 将右子树入栈s1
                if (popNode.right != null) {
                    s1.push(popNode.right);
                }
            }

            // 输出s2保存的结果
            while (!s2.isEmpty()) {
                Node popNode = s2.pop();
                System.out.print(popNode.value+ " ");
            }
        }
    }

    // 按层遍历 广度优先遍历
    public static void levelOrder(Node node) {
        if (node != null) {
            // 创建一个队列
            MyArrayQueue<Node> queue = new MyArrayQueue<>();
            // 根节点入队
            queue.offer(node);
            // 循环
            while (!queue.isEmpty()) {
                // 队头出队 并打印
                Node pollNode = queue.poll();
                System.out.print(pollNode.value + " ");
                // 如果该节点有左孩子 左孩子入队
                if (pollNode.left != null) {
                    queue.offer(pollNode.left);
                }
                // 如果该节点有右孩子 右孩子入队
                if (pollNode.right != null) {
                    queue.offer(pollNode.right);
                }
            }
        }
    }
    @Test
    public void testOrder() {
        // 构建一颗二叉树
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        // 递归的前序遍历操作
        // preOrder(root);
        // 1 2 4 5 3 6 7

        // 递归的中序遍历
        // inOrder(root);
        // 4 2 5 1 6 3 7

        // 递归的后序遍历
        // postOrder(root);
        // 4 5 2 6 7 3 1

        // find(root);
        // 递归序
        // 1 2 4 4 4 2 5 5 5 2 1 3 6 6 6 3 7 7 7 3 1
        // 递归的前,中,后遍历的本质就是递归序
        // 前序: 递归序中第一次出现的顺序 1 2 4 5 3 6 7
        // 中序: 递归序中第二次出现的顺序 4 2 5 1 6 3 7
        // 后序: 递归序中第三次出现的顺序 4 5 2 6 7 3 1

        // 非递归前序遍历
        // preOrder2(root);
        // 1 2 4 5 3 6 7

        // 非递归的中序遍历
        // inOrder2(root);
        // 4 2 5 1 6 3 7

        // 非递归后续遍历
        // postOrder2(root);
        //4 5 2 6 7 3 1


        // 按层遍历
        levelOrder(root);

    }
}
