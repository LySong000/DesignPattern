package classadapter;

/**
 * @Author: LySong
 * @Date: 2020/3/25 14:34
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
