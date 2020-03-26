package classadapter;

/**
 * @Author: LySong
 * @Date: 2020/3/25 14:32
 */
public class Phone {
    //充电方法
    public void charging(Voltage5V v){
        if(v.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else if (v.output5V() > 5){
            System.out.println("电压过高，无法充电");
        }
    }
}
