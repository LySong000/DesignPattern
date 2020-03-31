package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: LySong
 * @Date: 2020/3/30 16:39
 */
public class ProxyFactory {
    //维护一个目标对象，Object
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象，生成一个代理对象
    public Object getProxyInstance(){
        /*
        @CallerSensitive
        public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
            //1.ClassLoader : 指定当前目标对象使用的类加载器，获取加载器的方法固定
            //2.Class<?>[]: 目标对象实现的接口类型，使用泛型方式确认类型
            //3.InvocationHandler：时间处理，执行目标独享方法时。会触发事件处理器方法，会把当前执行的目标方法当作参数处理
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                }
                );
    }
}
