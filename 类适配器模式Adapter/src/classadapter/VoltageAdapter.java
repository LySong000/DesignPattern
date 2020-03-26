package classadapter;

/**
 * 适配器类
 * @Author: LySong
 * @Date: 2020/3/25 14:30
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        //获取到220v电压
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
