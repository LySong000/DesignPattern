package objectadpter;

/**
 * @Author: LySong
 * @Date: 2020/3/25 14:28
 */
public class Voltage220V {
    //输出220V的电压
    public int output220V(){
        int src = 220;
        System.out.println("电压=" + src + "V");
        return src;
    }
}
