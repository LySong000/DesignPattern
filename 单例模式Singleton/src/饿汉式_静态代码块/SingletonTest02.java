package 饿汉式_静态代码块;

/**
 * 饿汉式 静态代码块
 * 可用，浪费
 * @Author: LySong
 * @Date: 2020/3/21 14:43
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance1);
        System.out.println("instance1 + " + instance1.hashCode());
        System.out.println("instance2 + " + instance2.hashCode());
    }
}


class Singleton{

    //本类内部创建对象实例
    private static Singleton instance;

    //构造器私有化
    private Singleton(){
    }

    static {
        //在静态代码块中创建单例对象
        instance = new Singleton();
    }

    //提供一个共有的静态方法，返回实例对象
    public final static Singleton getInstance(){
        return instance;
    }
}