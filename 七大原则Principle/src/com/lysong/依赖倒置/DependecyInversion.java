package com.lysong.依赖倒置;

/**
 * @Author: LySong
 * @Date: 2020/3/19 15:15
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息: helloworld";
    }
}

/**
 * 方式一问题
 * 简单，比较容易想到
 * 如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接收方法
 * 解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口发生依赖
 * 因为Email，微信等属于接受的范围，各自实现接口就可以
 */
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

