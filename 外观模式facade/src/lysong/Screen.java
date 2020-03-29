package lysong;

/**
 * @Author: LySong
 * @Date: 2020/3/29 15:37
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("screen up");
    }

    public void down(){
        System.out.println("screen down");
    }

}
