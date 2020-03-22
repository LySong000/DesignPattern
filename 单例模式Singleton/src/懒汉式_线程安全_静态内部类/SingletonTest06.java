package 懒汉式_线程安全_静态内部类;

/**
 * 静态内部类方法
 * 类装载时，不会立即被实例化，而是在需要实例化时，调用getInstance方法，才会装在静态内部类
 * 类装载时是安全的
 * @Author: LySong
 * @Date: 2020/3/21 14:56
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance1);
        System.out.println("instance1 + " + instance1.hashCode());
        System.out.println("instance2 + " + instance2.hashCode());
    }
}

/**
 * 静态内部类
 */
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    /**
     * 写一个静态内部类，有一个静态属性Singleton
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 这里加锁，解决线程安全问题
     * 使用了jvm类装载机制，当需要的时候才会被装载进来
     * @return
     */
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
