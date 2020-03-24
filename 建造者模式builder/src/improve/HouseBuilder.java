package improve;

/**
 * @Author: LySong
 * @Date: 2020/3/24 14:02
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    /**
     * 建造好后返回产品
     * @return
     */
    public House buildHouse(){
        return house;
    }
}
