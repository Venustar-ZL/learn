package stringTest.thread.threadlocal;


/**
 * @ClassName: ThreadLocalTest2
 * @Description: 测试ThreadLocal无继承性
 * @Date: 2020-04-07 15:40
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ThreadLocalTest2 {

    static ThreadLocal<String> localVar = new ThreadLocal<>();

    public static void main(String[] args) {
        localVar.set("mainVar");

        Thread t = new Thread(() -> {
            System.out.println("子线程的本地变量值 : " + localVar.get());
        });
        t.start();
        System.out.println("主线程的本地变量值 : " + localVar.get());
    }

}
