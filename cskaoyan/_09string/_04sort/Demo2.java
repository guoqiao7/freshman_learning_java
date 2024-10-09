package com.cskaoyan._09string._04sort;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 9:19
 **/

public class Demo2 {
    public static void main(String[] args) {
        //Student s1 = new Student("zs", 20,66);
        //Student s2 = new Student("ls", 21, 77);
        //int compare = s1.compareTo(s2);
        //System.out.println(compare);
        Student s1 = new Student("zs", 20,66);
        Student s2 = new Student("ls", 21,59);
        Student s3 = new Student("ww", 19,66);
        Student s4 = new Student("zl", 25,99);
        Student s5 = new Student("zz", 18,88);
        Student[] students = {s1, s2, s3, s4, s5};

        System.out.println("排序前:");
        System.out.println(Arrays.toString(students));
        // 利用Arrays.sort方法进行排序
        Arrays.sort(students);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(students));

    }
}

// 想要对对象进行排序 -->实现Comparable接口
class Student implements Comparable<Student>{
    String name;
    int age;
    int score;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        // 比较规则
        // 按照分数进行比较 升序

        // return this.score - o.score;
        // return o.score - this.score;
        // 降序
        // 综合排序 默认按照分数升序排
        // 如果分数相同 按照年龄升序排
        if (this.score == o.score) {
            return this.age - o.age;
        }
        return this.score - o.score;

    }

    //@Override
    //public int compareTo(Object o) {
    //    return 0;
    //}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
