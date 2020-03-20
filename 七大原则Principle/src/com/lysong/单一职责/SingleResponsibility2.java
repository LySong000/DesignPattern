package com.lysong.单一职责;

/**
 * @Author: LySong
 * @Date: 2020/3/13 18:24
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

/**
 * 方案二.
 * 遵守单一职责原则
 * 但是这样做改动很大，分解类，修改客户端
 * 改进，直接修改Vehicle类
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}