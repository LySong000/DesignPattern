package lysong;

/**
 * 具体的网站
 * @Author: LySong
 * @Date: 2020/3/29 16:40
 */
public class ConcreteWebSite extends WebSite {

    private String type = "";//网站发布的形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName()+"网站的发布形式为：" + type);
    }
}
