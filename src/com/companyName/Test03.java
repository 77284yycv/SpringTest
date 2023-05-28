package com.companyName;

public class Test03 {
    //有一辆出租车
    // 属性 : 车牌 车型 车主
    // 行为载客: 尊敬的...,到达目的了
    public static void main(String[] args) {
        Taxi t=new Taxi();
        t.setLicensePlate("鲁A2L579");
        t.setVehicleModel("C1");
        t.setOwner("林元他丈母娘");
        Student student=new Student();
        student.setName("qd");
        t.carryPassenger(student);
    }
}
