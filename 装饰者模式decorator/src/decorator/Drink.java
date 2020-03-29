package decorator;

/**
 * @Author: LySong
 * @Date: 2020/3/26 14:35
 */
public abstract class Drink {
    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //被子类实现
    public abstract float cost();
}
