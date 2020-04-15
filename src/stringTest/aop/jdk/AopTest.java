package stringTest.aop.jdk;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-25 13:21
 * @Author: ZhangLei
 * version: 1.0
 **/
public class AopTest {

    public static void main(String[] args) {
        // 要代理的对象
        TestService testService = new TestServiceImpl();

        // 使用代理
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();

        // 代理之后的对象
        TestService testServiceProxy = (TestService) jdkDynamicProxy.newProxy(testService);

        testServiceProxy.add();
    }

}
