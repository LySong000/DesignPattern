package improve;

/**
 * @Author: LySong
 * @Date: 2020/3/24 14:10
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        HighBuilder highBuilder = new HighBuilder();
        houseDirector.setHouseBuilder(highBuilder);
        House house1 = houseDirector.constructHouse();

    }
}
