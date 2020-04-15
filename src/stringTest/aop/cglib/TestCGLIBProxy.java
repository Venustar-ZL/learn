package stringTest.aop.cglib;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-25 14:03
 * @Author: ZhangLei
 * version: 1.0
 **/
public class TestCGLIBProxy {

    public static void main(String[] args) {

        // 要代理的对象
        TestCGLIBServiceImpl testCGLIBService = new TestCGLIBServiceImpl();

        // 使用代理
        CGLIBProxy cglibProxy = new CGLIBProxy();

        // 代理之后的对象
        TestCGLIBServiceImpl testCGLIBServiceProxy = (TestCGLIBServiceImpl) cglibProxy.createProxyInstance(testCGLIBService);

        // 调用方法
        testCGLIBServiceProxy.add();
    }

}
