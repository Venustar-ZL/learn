package stringTest.thread;

/**
 * @ClassName: ThreadWaitTest
 * @Description: 线程等待测试
 * @Date: 2020-03-24 11:18
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            try{
                System.out.println("等待b完成计算");
                b.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("b的总和是%d", b.total));
    }

}
