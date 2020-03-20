package com.lysong.单一职责;

/**
 * @Author: LySong
 * @Date: 2020/3/13 18:22
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");
        vehicle.run("汽车");
    }
}

/**
 * 交通工具类
 * 方式1
 * 在run方法中 违反了单一职责原则
 * 解决的方案非常简单，根据交通工具的不同分成不同的类
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}