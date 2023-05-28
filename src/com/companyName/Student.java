package com.companyName;

public class Student {
    //属性(成员变量)
    private int age;
    private String name="林元元我的老公";
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    
    public Student() {
    }

    public Student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    //////////////////////////////////////////////////
//行为
    /***
     * @Description study
     * 功能描述:
     * @paramTypes: [java.lang.String]
     * @params: [course]
     * @return:
     * @auther: qd
     * @date: 2023/5/24 9:49
     */
    public void study(String course) {
        System.out.println(this.name+"正在学习："+course);
    }
    public void play(String name) {
        System.out.println(this.name+"正在玩："+name);
    }
    public void put(String thing){
        System.out.println(this.getName()+"把" + thing + "放进冰箱里");
    }
}
