/**
 * 折叠手机类
 * @Author: LySong
 * @Date: 2020/3/26 13:35
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立手机");
    }

    public void close(){
        super.close();
        System.out.println("直立手机");
    }

    public void call(){
        super.call();
        System.out.println("直立手机");
    }
}
