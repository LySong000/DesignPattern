/**
 * @Author: LySong
 * @Date: 2020/3/26 13:34
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
