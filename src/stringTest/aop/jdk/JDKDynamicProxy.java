package stringTest.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: JDKDynamicProxy
 * @Description: JDK动态代理测试
 * @Date: 2020-03-25 11:45
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class JDKDynamicProxy implements InvocationHandler{
    // 被代理的对象
    private Object proxyObj;

    /**
    * @Description:
    * @Param: [proxyObj]
    * @return: java.lang.Object
    * @Author: ZhangLei
    * @Date: 2020/3/25
    */
    public Object newProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
        // 返回一个代理对象
        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(), proxyObj.getClass().getInterfaces(), this);
    }


    /**
     * 此方法 ：proxy.method() 被代理的过程
     * @param proxy 被代理的对象
     * @param method 要调用的方法
     * @param args 方法调用时所需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 通过反射机制 调用目标对象的方法
        Object obj = method.invoke(this.proxyObj, args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("开始执行目标对象之前...");
    }

    public void after() {
        System.out.println("开始执行目标对象之后...");
    }
}
