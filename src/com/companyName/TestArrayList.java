package com.companyName;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("test");
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("test");
        arrayList.add("test");

        arrayList.removeAll(new ArrayList<String>(){{add("test");}});
        System.out.println(arrayList);
//        //方法一
//        for (int i = 0; i < arrayList.size(); i++) {
//            String s = arrayList.get(i);
//            if ("test".equals(s)) {
//                arrayList.remove(i);
//                i--;
//            }
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        //方法二 倒序
//        for (int i = arrayList.size()-1; i >=0; i--) {
//            String s = arrayList.get(i);
//            if ("test".equals(s)) {
//                arrayList.remove(i);
//            }
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
    }
}
