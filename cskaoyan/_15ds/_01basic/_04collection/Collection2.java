package com.cskaoyan._15ds._01basic._04collection;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 10:54
 **/

public class Collection2 {
    // 存放商品数据
    private Goods[] goods = new Goods[10];

    // 记录容器中的数据的个数
    private int count;

    // 给外界一个访问入口 获取容器数据的个数
    public int getCount() {
        return count;
    }

    // 提供操作容器的方法
    // 向容器中添加商品
    public void add(Goods goods) {
        // 把商品数据填充到数组中
        this.goods[count] = goods;
        // 更新count
        count++;
    }

    // 删除
    public boolean remove(Goods goods) {
        // do sth
        return false;
    }
    // 查找
    // 修改
}

class Goods{
    String name;
    int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}