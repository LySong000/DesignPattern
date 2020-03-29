package lysong;

import java.util.HashMap;

/**
 * 网站工厂类
 * @Author: LySong
 * @Date: 2020/3/29 16:42
 */
public class WebSiteFactory {
    //重当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();
    //根据类型，返回网站，如果没有就创建一个，并放入到池中
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (ConcreteWebSite) pool.get(type);
    }

    //获取网站分类的总数
    public int getWebSiteCount(){
        return pool.size();
    }
}
