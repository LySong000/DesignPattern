/**
 * @Author: LySong
 * @Date: 2020/3/26 13:33
 */
public class XiaoMi implements Brand {
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }
}
