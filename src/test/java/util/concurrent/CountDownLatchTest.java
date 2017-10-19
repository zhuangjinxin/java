package test.java.util.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    private static CountDownLatch c = new CountDownLatch(3);

    static class Thread1 extends Thread{
        @Override
        public void run(){
            for (int i = 0; i < 3; i++) {
                c.countDown();
                System.out.println("-1");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        new Thread1().start();
        c.await();
        System.out.println("Done");
    }
}
