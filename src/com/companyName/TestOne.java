package com.companyName;

public class TestOne {
    public static void main(String[] args) {
        //面向过程:
        //第一步 打开冰箱门
        openDoor();
        //第二步 把...放进冰箱put( thing:"酸奶");//第三步 关闭冰箱门closeDoor0;
        put("酸奶1");
        //第三步 关闭冰箱门
        closeDoor();
        //改成面向对象的:
        Refrigerator refrigerator=new Refrigerator();
        Student stu=new Student(27,"林元","男");
        //第一步 打开冰箱门
        refrigerator.openDoor();
        //第二步 把...放进冰箱put( thing:"酸奶");//第三步 关闭冰箱门closeDoor0;
        stu.put("酸奶2");
        //第三步 关闭冰箱门
        refrigerator.closeDoor();
    }

    public static void openDoor () {
        System.out.println("打开冰箱门");
    }
    public static void put(String thing){
        System.out.println("把" + thing + "放进冰箱里");
    }
    public static void closeDoor () {
        System.out.println("关闭冰箱门");
    }
}


