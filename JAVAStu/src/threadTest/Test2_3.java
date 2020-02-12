package threadTest;

/**
 * @author houbj
 * @date 2019/12/5 10:41
 */
public class Test2_3 {
    public static void main(String[] args) {

        Thread t1 = new Thread("t1");

        ThreadGroup group = new ThreadGroup("testGtoup");

        Thread t2 = new Thread(group, "t2");
        ThreadGroup mainThread = Thread.currentThread().getThreadGroup();

        System.out.println("main thread belong to group : " + mainThread.getName());

        System.out.println(" t1 a nd main belong the same group : " + (mainThread == t1.getThreadGroup()));

        System.out.println(" t2 thread group not belong main group : " + (mainThread == t2.getThreadGroup()));

        System.out.println(" t2 thread belong to group : " + (group == t2.getThreadGroup()));
    }
}
