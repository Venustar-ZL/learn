package stringTest.aop.jdk;


/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-25 11:46
 * @Author: ZhangLei
 * version: 1.0
 **/
public class TestServiceImpl implements TestService {
    @Override
    public void add() {
        System.out.println("正在添加...");
    }
}
