package stringTest.aop.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName:
 * @Description: cglib代理
 * @Date: 2020-03-25 13:38
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class CGLIBProxy implements MethodInterceptor {

    // 被代理的目标对象
    private Object targetObject;

    public Object createProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        // 增强
        Enhancer enhancer = new Enhancer();
        // 设置代理目标
        enhancer.setSuperclass(targetObject.getClass());
        // 设置回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     *  在代理实例上处理方法调用并返回结果
     * @param o  代理类
     * @param method  被代理的方法
     * @param objects  该方法的参数数组
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object result = null;
        try {
            System.out.println("前置方法开始执行...");
            // 调用目标对象的方法
            result = method.invoke(targetObject, objects);
            System.out.println("后置方法开始执行...");
        }
        catch (Exception e) {
            System.out.println("异常处理...");
        }
        finally {
            System.out.println("调用结束...");
        }
        return result;
    }
}
