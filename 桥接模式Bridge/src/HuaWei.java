import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author: LySong
 * @Date: 2020/3/26 13:32
 */
public class HuaWei implements Brand {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void open() {
        System.out.println("华为手机开机");
    }
}
