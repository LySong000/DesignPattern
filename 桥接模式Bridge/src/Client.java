import java.security.Permission;

/**
 * @Author: LySong
 * @Date: 2020/3/26 13:39
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠式手机（样式+品牌）
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        Phone phone1 = new FoldedPhone(new HuaWei());
        phone1.open();
        phone1.call();
        phone1.close();

        Phone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
