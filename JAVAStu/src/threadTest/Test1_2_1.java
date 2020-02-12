package threadTest;

import java.util.concurrent.TimeUnit;



/**
 * @author houbj
 * @date 2019/12/4 14:53
 */
public class Test1_2_1 {
    public static void main(String[] args) throws InterruptedException {

        news();
        musics();
    }

    public static void news() throws InterruptedException {
        for ( ; ;) {
            System.out.println("good news");
            sleep(1);
        }
    }

    public static void musics() throws InterruptedException {
        for ( ; ; ) {
            System.out.println("good news");
            sleep(1);
        }
    }
    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
