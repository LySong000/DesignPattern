package objectadpter;

/**
 * 适配器类
 * @Author: LySong
 * @Date: 2020/3/25 14:30
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter() {
        this.voltage220V = new Voltage220V();
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(voltage220V != null){
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器");
            dst = src / 44;
            System.out.println("适配完成，输出电压为:" +dst);
        }
        return dst;
    }
}
