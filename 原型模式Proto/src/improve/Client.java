package improve;

/**
 * @Author: LySong
 * @Date: 2020/3/23 12:57
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.setFriend(new Sheep("jack",2,"黑色"));
        Sheep clone0 = (Sheep) sheep.clone();
        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(clone0 + "" + clone0.getFriend().hashCode());
        System.out.println(clone1 + "" + clone1.getFriend().hashCode());
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
