package lysong;

/**
 * @Author: LySong
 * @Date: 2020/3/29 16:45
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));


        System.out.println(factory.getWebSiteCount());

    }
}
