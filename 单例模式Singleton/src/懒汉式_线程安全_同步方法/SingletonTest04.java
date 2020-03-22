package 懒汉式_线程安全_同步方法;

/**
 * 懒汉式，线程安全，同步代码块
 * 但是会引发并发效率低的问题
 * @Author: LySong
 * @Date: 2020/3/21 14:56
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance1);
        System.out.println("instance1 + " + instance1.hashCode());
        System.out.println("instance2 + " + instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    /**
     * 这里加锁，解决线程安全问题
     * @return
     */
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
