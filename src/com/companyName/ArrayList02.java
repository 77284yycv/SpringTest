package com.companyName;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(12,"天使","女"));
        list.add(new Student(17,"Noah","男"));
        list.add(new Student(27,"林元","男"));

        System.out.println(new ArrayList02().ageList(list));
    }
    //筛选age<18的学生
    public List<Student> ageList(List<Student> list) {
        List<Student> newlist=new ArrayList<Student>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()<18){
                newlist.add(list.get(i));
            }
        }
        return newlist;
    }
}
