package lysong;

import sun.java2d.pipe.SpanIterator;

/**
 * @Author: LySong
 * @Date: 2020/3/29 15:37
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void playing(){
        System.out.println("popcorn is playing");
    }

    public void pause(){
        System.out.println("popcorn is pause");
    }
}
