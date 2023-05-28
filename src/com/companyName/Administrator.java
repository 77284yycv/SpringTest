package com.companyName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrator {
    private String userName="admin";
    private String passWord="123456";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



    @Override
    public String toString() {
        return "Administrator{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
    Scanner sc=new Scanner(System.in);
    private List<Student> list=new ArrayList<Student>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    //登录
    public void login() {
        while (true){

            System.out.println("请输入用户名：");
            String user=sc.next();
            System.out.println("请输入密码：");
            String pwd=sc.next();
            Administrator ad=new Administrator();
            if(!ad.getUserName().equals(user)||!ad.getPassWord().equals(pwd)){
                System.out.println("用户名或密码不正确");
                continue;
            }else {break;}
        }
    }

    //添加stu
    public  void addStu() {
        System.out.println("请输入学生名：");
        String userName=sc.next();
        System.out.println("请输入学生年龄：");
        int age=sc.nextInt();
        System.out.println("请输入学生性别：");
        String gender=sc.next();
        list.add(new Student(age,userName,gender));
    }
    //查看stu
    public void getStu() {
        System.out.println(list);
    }
}
