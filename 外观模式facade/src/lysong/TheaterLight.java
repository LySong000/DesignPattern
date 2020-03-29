package lysong;

/**
 * @Author: LySong
 * @Date: 2020/3/29 15:37
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("theater light on");
    }

    public void off(){
        System.out.println("theater light off");
    }

    public void dim(){
        System.out.println("theater light is dim");
    }

    public void bright(){
        System.out.println("theater light is bright");
    }
}
