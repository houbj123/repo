package threadTest;

import java.util.concurrent.TimeUnit;

/**
 * @author houbj
 * @date 2019/12/9 16:23
 */
public class Test3_7_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        TimeUnit.MILLISECONDS.sleep(20);
        thread.interrupt();

    }
}
