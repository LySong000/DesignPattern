package dynamic;

/**
 * @Author: LySong
 * @Date: 2020/3/30 16:48
 */
public class Client {
    public static void main(String[] args) {
        //创建一个目标对象
        TeacherDao target = new TeacherDao();
        //给目标对象，创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //从这里可以看出内存中动态生成了代理对象
        System.out.println(proxyInstance);
        //通过代理对象调用目标对象的方法
        proxyInstance.teach();

    }
}
