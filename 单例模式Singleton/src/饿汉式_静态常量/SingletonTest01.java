package 饿汉式_静态常量;

/**
 * 饿汉式 静态常量法
 * 类装载的时候完成实例化，避免了线程同步问题
 * 但是没有达到懒加载的问题，如果从始至终没有用过会造成内存的浪费
 * @Author: LySong
 * @Date: 2020/3/21 14:43
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance1);
        System.out.println("instance1 + " + instance1.hashCode());
        System.out.println("instance2 + " + instance2.hashCode());
}
}


class Singleton{
    //构造器私有化
    private Singleton(){

    }
    //本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //提供一个共有的静态方法，返回实例对象
    public final static Singleton getInstance(){
        return instance;
    }
}