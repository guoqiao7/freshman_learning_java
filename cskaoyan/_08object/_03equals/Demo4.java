package com.cskaoyan._08object._03equals;

import java.util.Objects;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 10:26
 **/

public class Demo4 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("zs", new Subject("math"));
        Teacher t2 = new Teacher("zs", new Subject("math"));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }
}

class Teacher{
    String teacherName;
    Subject subject;

    public Teacher(String teacherName, Subject subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    // 重写toString
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", subject=" + subject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (!Objects.equals(teacherName, teacher.teacherName)) return false;
        return Objects.equals(subject, teacher.subject);
    }

}

class Subject{
    String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return Objects.equals(subjectName, subject.subjectName);
    }


}
