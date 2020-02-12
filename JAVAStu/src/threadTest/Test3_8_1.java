package threadTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author houbj
 * @date 2019/12/9 16:46
 */
public class Test3_8_1 {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(0,2).mapToObj(Test3_8_1::create).collect(toList());

        threads.forEach(Thread::start);

//        for (Thread thread :threads) {
//            thread.join();
//        }
        for (int i = 0 ; i < 10 ; i++ ){
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
        }
    }

    private static Thread create(int seq){
        return new Thread(()->{
            for (int i = 0 ; i < 10 ; i++ ){
                System.out.println(Thread.currentThread().getName() + "#" +i );
                shortSleep();
            }
        }, String.valueOf(seq));
    }

    private static void shortSleep(){
        try{
            TimeUnit.SECONDS.sleep(1);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
