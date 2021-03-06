package com.lysong.里氏替换;


/**
 * @Author: LySong
 * @Date: 2020/3/20 17:20
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11,3));
        System.out.println("1-8=" + a.func1(1,8));
        System.out.println("------------------");
        B b = new B();
        //本意是求出11-3，但是因为重写了方法，所以不正确
        System.out.println("11-3=" + b.func1(11,3));
        System.out.println("1-8=" + b.func1(1,8));
        System.out.println("11+3+9=" + b.func2(11,3));
    }
}

class A{
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends A{
    /**
     * 重写了A类的方法，重写可能是无意识的
     * @param a
     * @param b
     * @return
     */
    @Override
    public int func1(int a, int b){
        return a + b;
    }
    public int func2(int a, int b){
        return func1(a,b) + 9;
    }

}