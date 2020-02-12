package threadTest;

import java.util.stream.IntStream;

/**
 * @author houbj
 * @date 2019/12/9 15:45
 */
public class Test3_2_1 {
    public static void main(String[] args) {
        IntStream.range(0,2).mapToObj(Test3_2_1::create).forEach(Thread::start);
    }
    private static Thread create(int index){
        return new Thread(() -> {
            if (index == 0 ){
                Thread.yield();
            }
            System.out.println(index);
        });
    }
}
