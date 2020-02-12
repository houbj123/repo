package threadTest;

import java.util.stream.IntStream;

/**
 * @author houbj
 * @date 2019/12/5 10:24
 */
public class Test2_1_2 {

    private final static String PREFIX = "ALEX-" ;
    public static void main(String[] args) {
        IntStream.range(0,5).mapToObj(Test2_1_2::createThread).forEach(Thread::start);
    }
    private static Thread createThread(final int name) {
        return new Thread(() -> System.out.println(Thread.currentThread().getName()), PREFIX+name);
    }
}
