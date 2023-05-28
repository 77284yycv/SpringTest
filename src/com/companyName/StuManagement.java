package com.companyName;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManagement {

    public static void main(String[] args) {
        Administrator admin=new Administrator();
        Scanner sc=new Scanner(System.in);
        admin.login();
        fo:while(true){
        System.out.println("--------欢迎来到学生管理系统--------\n请输入您的选择:");
        String choice=sc.next();
            switch(choice){
                case "1":
                    System.out.println("1 添加学生");
                    admin.addStu();
                    break;
                case "2":
                    System.out.println("2 删除学生");
                    break;
                case "3":
                    System.out.println("3 修改学生");
                    break;
                case "4":
                    System.out.println("4 查看学生");
                    admin.getStu();
                    break;
                default:
                    System.out.println("退出");
                    //System.exit(0);
                    break fo;
            }
        }
    }
    //添加学生


}
