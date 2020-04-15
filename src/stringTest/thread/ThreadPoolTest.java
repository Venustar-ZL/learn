package stringTest.thread;

import java.util.concurrent.*;

/**
 * @ClassName: ThreadPoolTest
 * @Description: 线程池测试
 * @Date: 2020-03-24 13:56
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class ThreadPoolTest {

    public static void main(String[] args) {
        // 创建一个可重用固定线程数的线程池
//        ExecutorService pool = Executors.newFixedThreadPool(1);

        // 创建一个使用单个worker线程的Executor，以无界队列的方式来运行该线程
//        ExecutorService pool = Executors.newSingleThreadExecutor();

        // 可变尺寸的线程池 创建一个可根据需要创建新线程的线程池
//        ExecutorService pool = Executors.newCachedThreadPool();
        Thread t1 = new MyThread();

        // 创建一个可在给定延迟后运行命令或者定期的执行的线程池
//        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);

        // 创建一个单任务延迟线程池
//        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();

        // 自定义线程池
        // 1、创建一个阻塞队列
        BlockingQueue<Runnable> bqueue1 = new ArrayBlockingQueue<>(20);  // 基于数组的先进先出的有界队列
        BlockingQueue<Runnable> bqueue2 = new LinkedBlockingQueue<>();           // 基于链表的先进先出队列，optionally-bounded（可选有界）
        BlockingQueue<Runnable> bqueue3 = new SynchronousQueue<>();              // 无缓冲的等待队列，无界
        // 2、创建一个自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 2, TimeUnit.MILLISECONDS, bqueue1);
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        // 使用延迟执行的方法
//        pool.schedule(t4, 10, TimeUnit.MILLISECONDS);
//        pool.schedule(t5, 10, TimeUnit.MILLISECONDS);

        // 关闭线程池
        pool.shutdown();
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "正在执行...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
