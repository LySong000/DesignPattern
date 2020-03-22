package 枚举;

import java.sql.SQLOutput;

/**
 * @Author: LySong
 * @Date: 2020/3/21 19:25
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());
    }

}

enum Singleton{
    INSTANCE;
    public void sayok(){
        System.out.println("ok~");
    }
}