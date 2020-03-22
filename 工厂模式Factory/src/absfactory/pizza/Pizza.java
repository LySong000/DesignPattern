package absfactory.pizza;

/**
 * @Author: LySong
 * @Date: 2020/3/22 13:45
 */
public abstract class Pizza {

    /**
     * 披萨的名字
     */
    protected String name;

    /**
     * 准备原材料
     * 不同的披萨不一样，因此做成抽象方法
     */
    public abstract void perpare();

    /**
     * 烤披萨
     */
    public void bake(){
        System.out.println(name + "baking;");
    }

    /**
     * 切割披萨
     */
    public void cut(){
        System.out.println(name + "cutting;");
    }

    /**
     * 打包
     */
    public void box(){
        System.out.println(name + "boxing;");
    }

    public void setName(String name){
        this.name = name;
    }

}
