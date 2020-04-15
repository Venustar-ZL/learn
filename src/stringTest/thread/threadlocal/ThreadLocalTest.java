package stringTest.thread.threadlocal;

/**
 * @ClassName: ThreadLocalTest
 * @Description:
 * @Date: 2020-04-07 15:14
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ThreadLocalTest {

    static ThreadLocal<String> localvar = new ThreadLocal<>();

    static void print(String str) {
        // 打印当前线程中本地内存中本地变量的值
        System.out.println(str + " : " + localvar.get());
        // 清除本地内存中的本地变量
        localvar.remove();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            localvar.set("localVar1");
            print("thread1");
            System.out.println("after remove" + " : " + localvar.get());
        });

        Thread t2 = new Thread(() -> {
            localvar.set("localVar2");
            print("thread2");
            System.out.println("after remove" + " : " + localvar.get());
        });

        t1.start();
        t2.start();
    }

}
