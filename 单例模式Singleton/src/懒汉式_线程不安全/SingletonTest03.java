package 懒汉式_线程不安全;

/**
 * 懒汉式，线程不安全的
 * 达到了懒加载的效果
 * 当不同的线程同时调用instance时，如果此时对象为空
 * 可能会产生两个实例
 * 在多线程环境下不能使用这种方式
 * @Author: LySong
 * @Date: 2020/3/21 14:56
 */
public class SingletonTest03 {
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

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
