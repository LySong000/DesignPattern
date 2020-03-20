package com.lysong.依赖倒置.improve;

/**
 * @Author: LySong
 * @Date: 2020/3/19 15:15
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeiXin());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息: helloworld";
    }
}

class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信接收消息:hellook";
    }
}


class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

