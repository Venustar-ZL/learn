package stringTest.thread;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-24 11:20
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ThreadB extends Thread {

    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
            notify();
        }
    }
}
