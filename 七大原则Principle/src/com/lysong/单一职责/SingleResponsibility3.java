package com.lysong.单一职责;

/**
 * @Author: LySong
 * @Date: 2020/3/13 18:28
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

/**
 * 方式三.
 * 这种修改方法没有对原来的类做大的修改，知识增加方法
 * 这里虽然没有在类这个级别上，没有遵守单一职责原则，但在方法级别上遵守了单一职责原则
 * 若类中的逻辑非常复杂，还得分解为多个类
 * 各行其职
 */
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路运行");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空运行");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}