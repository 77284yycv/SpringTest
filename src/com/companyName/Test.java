package com.companyName;

public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu2=new Student();
        stu.setName("林元元开发总裁");
        stu2.setAge(26);
        stu.setAge(stu2.getAge()+1);
        System.out.println(stu.toString()+"--"+stu2.toString());
        stu.study("架构设计课程");

    }
}
