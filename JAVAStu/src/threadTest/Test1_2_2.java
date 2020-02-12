package threadTest;


import java.util.concurrent.TimeUnit;

/**
 * @author houbj
 * @date 2019/12/4 14:57
 */
public class Test1_2_2 {

    public static void main(String[] args) throws InterruptedException {


        new Thread() {
            @Override
            public void run(){
                try {
                    news();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

//        new Thread(Test1_2_2::musics).start();

        musics();
//        new Thread(){
//            @Override
//            public void run(){
//                try {
//                    news();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();
//        new Thread(Test1_2_2::news).start();
    }

    public static void news() throws InterruptedException {
        for ( ; ;) {
            System.out.println("good news");
            sleep(1);
        }
    }

    public static void musics() throws InterruptedException {
        for ( ; ; ) {
            System.out.println("good music");
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
