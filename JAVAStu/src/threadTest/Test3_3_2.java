package threadTest;

/**
 * @author houbj
 * @date 2019/12/9 16:04
 */
public class Test3_3_2 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("test");

        group.setMaxPriority(7);

        Thread t1 = new Thread(group, "test-tread");

        t1.setPriority(10);
        System.out.println(t1.getPriority());
    }
}
