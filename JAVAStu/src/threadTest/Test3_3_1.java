package threadTest;

/**
 * @author houbj
 * @date 2019/12/9 16:00
 */
public class Test3_3_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("t1");
            }
        });
        t1.setPriority(3);

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("t2");
            }
        });

        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
