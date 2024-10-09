package com.cskaoyan._15ds._05tree;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/24 10:12
 **/
/*
T extends Comparable<T>
泛型T是可以比较的,T作为Comparable接口的子类
 */
public class MyBinarySearchTree<T extends Comparable<T>> {
    // 基本结构
    // 根节点
    private Node root;
    // 节点结构
    private class Node{
        // 数据域
        T value;
        // 指针域
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
        }
    }

    // API
    // 判断树是否为空
    public boolean isEmpty() {
        return root == null;
    }
    // 打印树


    public void printTree(){
        printTree(root);
    }
    private void printTree(Node node) {
        // 中序遍历
        if (node == null) {
            return;
        }
        // 左根右
        printTree(node.left);
        System.out.print(node.value+" ");
        printTree(node.right);

    }
    // 插入节点
    public void insert(T value) {
        root = insert(root, value);
    }

    // 递归插入节点
    private Node insert(Node node, T value) {
        // 递归出口
        if (node == null) {
            return new Node(value);
        }
        // value进行比较
        int compare = value.compareTo(node.value);
        if (compare < 0) {
            // 说明新节点小于当前节点
            // 递归插入左子树
            node.left = insert(node.left, value);
        } else if (compare > 0) {
            // 说明新节点大于当前节点
            // 递归插入右子树中
            node.right = insert(node.right, value);
        }else{
            // 说明value都相同
            // 啥也不干  不允许重复
        }
        return node;
    }

    // 递归查找的方法
    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node node, T value) {
        // 递归出口
        if (node == null) {
            return false;
        }
        // compare比较
        int compare = value.compareTo(node.value);
        if (compare < 0) {
            // 递归查找左子树
            return contains(node.left, value);
        } else if (compare > 0) {
            // 递归查找右子树
            return contains(node.right, value);
        }else {
            // value值相等 返回true  找到了
            return true;

        }
    }

    // 非递归查找
    public boolean find(T value) {
        return find(root, value);
    }

    private boolean find(Node node, T value) {
        // 判断空
        if (isEmpty()) {
            return false;
        }
        // value比较
        while (node != null) {
            int compare = value.compareTo(node.value);
            if (compare < 0) {
                // 找左子树
                node = node.left;
            } else if (compare > 0) {
                // 找右子树
                node = node.right;
            }else{
                // value相等 找到了
                return true;
            }
        }
        // 树中没存这个数据
        return false;
    }

    // 递归找最小值
    public T recursiveFindMin() {
        Node minNode = findMin(root);
        return minNode.value;
    }

    private Node findMin(Node node) {
        // 递归出口
        if (node.left == null) {
            // 说明找到了
            // 返回当前这个最小值节点
            return node;
        }
        // 说明有左子树
        // 递归找左子树
        return findMin(node.left);
    }

    // 非递归找最大值
    public T unRecursiveFindMax(){
        Node maxNode = findMax(root);
        return maxNode.value;
    }

    private Node findMax(Node node) {
        // 判空
        if (isEmpty()) {
            return null;
        }
        // 遍历查找
        while (node.right != null) {
            node = node.right;
        }
        // 循环结束 当前节点就是最大值节点
        return node;
    }

    // 递归删除节点
    public void remove(T value) {
        root = remove(root,value);
    }

    private Node remove(Node node, T value) {
        // 递归出口
        if (node == null) {
            return null;
        }
        // value比较
        int compare = value.compareTo(node.value);
        if (compare < 0) {
            // 递归删除左子树
            node.left = remove(node.left, value);
        } else if (compare > 0) {
            // 递归删除右子树
            node.right = remove(node.right, value);
        }else{
            // value相同
            // 找到了要被删除的节点
            // 1.被删节点是叶子--->直接删除
            // 2.被删节点是单分支节点(1个孩子)-->子承父业
            // 3.被删节点是双分支节点(2个孩子)
            //   a.在该节点的右子树找找最小值节点
            //   b.把该节点的value替换为最小值节点的value
            //   c.递归删除最小值节点
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }else{
                // 执行到这里 --->该节点有2个孩子
                //   a.在该节点的右子树找找最小值节点
                Node minNode = findMin(node.right);
                //   b.把该节点的value替换为最小值节点的value
                node.value = minNode.value;
                //   c.递归删除最小值节点
                node.right = remove(node.right, minNode.value);
            }
        }
        // 返回当前节点
        return node;
    }

    @Test
    public void testInsert() {
        // 创建BST
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        // Integer[] arr = {6, 2, 8, 1, 4, 3, 5};
        Integer[] arr = {6, 2, 8};
        // 遍历数组 进行插入操作
        for (Integer value : arr) {
            bst.insert(value);
        }

        // 打印
        bst.printTree();
        // 1 2 3 4 5 6 8
    }

    @Test
    public void testContains() {
        // 创建BST
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        Integer[] arr = {6, 2, 8, 1, 4, 3, 5};
        // 遍历数组 进行插入操作
        for (Integer value : arr) {
            bst.insert(value);
        }

        // 打印
        bst.printTree();
        // 1 2 3 4 5 6 8

        //boolean result = bst.contains(5);
        //boolean result2 = bst.contains(10);
        //System.out.println(result);
        //System.out.println(result2);

        //boolean result = bst.find(4);
        //System.out.println(result);

        // 找最小值
        //Integer min = bst.recursiveFindMin();
        //System.out.println();
        //System.out.println("min: "+min);

        // 找最大值
        Integer max = bst.unRecursiveFindMax();
        System.out.println("max = " + max);
    }


    @Test
    public void testRemove() {
        // 创建BST
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        Integer[] arr = {6, 2, 8, 1, 4, 3, 5,10};

        // 遍历数组 进行插入操作
        for (Integer value : arr) {
            bst.insert(value);
        }

        // 打印
        bst.printTree();
        // 1 2 3 4 5 6 8 10
        // System.out.println("删除叶子节点");
        // 删除叶子节点
        // bst.remove(1);

        // 删除单分支节点
        // System.out.println("删除单分支节点");

        // bst.remove(8);


        System.out.println("删除双分支节点");
        bst.remove(2);

        bst.printTree();

    }
}
