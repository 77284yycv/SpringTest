package com.companyName;

public class Taxi {
    // 属性 : 车牌
    private String licensePlate;
    // 车型
    private String vehicleModel;
    // 车主Car owner
    private String owner;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Taxi() {
    }

    public Taxi(String licensePlate, String vehicleModel, String owner) {
        this.licensePlate = licensePlate;
        this.vehicleModel = vehicleModel;
        this.owner = owner;
    }
    /**
     * 载客
     */
    public void carryPassenger(Student stu) {
        System.out.println("尊敬的"+stu.getName()+this.getLicensePlate()+"牌的"+this.getVehicleModel()+"车,到达目的了");
    }
}
