package improve;

import java.util.SimpleTimeZone;

/**
 * @Author: LySong
 * @Date: 2020/3/24 14:07
 */
public class HighBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙10米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封透明屋顶");
    }
}
