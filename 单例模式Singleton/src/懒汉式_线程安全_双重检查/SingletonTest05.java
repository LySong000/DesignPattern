package 懒汉式_线程安全_双重检查;

/**
 * 懒汉式，线程安全，同步代码块
 * 但是会引发并发效率低的问题
 * @Author: LySong
 * @Date: 2020/3/21 14:56
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance1);
        System.out.println("instance1 + " + instance1.hashCode());
        System.out.println("instance2 + " + instance2.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    /**
     * 这里进行双重检查，解决线程安全问题，解决懒加载的问题
     * @return
     */
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
