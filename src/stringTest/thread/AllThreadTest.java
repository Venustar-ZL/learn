package stringTest.thread;

/**
 * @ClassName: ThreadTest
 * @Description: 线程测试
 * @Date: 2020-03-24 09:45
 * @Author: ZhangLei
 * version: 1.0
 **/
public class AllThreadTest {
    public static void main(String[] args) {
        RunnableTest test1 = new RunnableTest("小明");
        RunnableTest test2 = new RunnableTest("小强");
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);

        thread1.start();
        thread2.start();


//        Thread test1 = new ThreadTest("小明");
//        Thread test2 = new ThreadTest("小强");
//        test1.start();
//        test2.start();
    }


}

class RunnableTest implements Runnable {

    private String name;

    public RunnableTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (long j = 0; j < 100000000; j++);
            System.out.println(name + "——>" + i);
        }
    }
}

class ThreadTest extends Thread {

    private String name;

    public ThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (long j = 0; j < 100000000; j++);
            System.out.println(name + "——>" + i);
        }
    }
}
