package threadTest;

import java.util.stream.IntStream;

/**
 * @author houbj
 * @date 2019/12/4 16:57
 */
public class Test2_1_1 {
    public static void main(String[] args) {
        IntStream.range(1,5).boxed().map( i -> new Thread(
                ()-> System.out.println(Thread.currentThread().getName())
        )).forEach(Thread::start);

        IntStream.range(0, 5).boxed().map(i -> new Thread(() -> System.out.println(Thread.currentThread().getName()))).forEach(Thread::start);
    }
}
