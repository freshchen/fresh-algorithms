import java.util.concurrent.CountDownLatch;

/**
 * @anthor LingChen
 * @create 8/8/2019 3:05 PM
 * @Description
 */
public class Q1114 {

    private final CountDownLatch countDownLatch12;
    private final CountDownLatch countDownLatch23;

    public Q1114() {
        countDownLatch12 = new CountDownLatch(1);
        countDownLatch23 = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countDownLatch12.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        countDownLatch12.await();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        countDownLatch23.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        countDownLatch23.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
