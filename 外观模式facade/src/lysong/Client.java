package lysong;

/**
 * @Author: LySong
 * @Date: 2020/3/29 15:43
 */
public class Client {
    public static void main(String[] args) {
        //如果直接调用，很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
