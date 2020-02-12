package threadTest;

/**
 * @author houbj
 * @date 2019/12/4 16:35
 */
public class Test1_5_3 {

    public static void main(String[] args) {
        final TicketWindowByRunable task = new TicketWindowByRunable();
        Thread t1 = new Thread(task, "number 1");
        Thread t2 = new Thread(task, "number 2");
        Thread t3 = new Thread(task, "number 3");
        Thread t4 = new Thread(task, "number 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class TicketWindowByRunable implements Runnable {
//    private final String name;
    private static final int max = 50;

        private int index = 1;
//    private static int index = 1;

//    TicketWindowByRunable(String name) {
//        this.name = name;
//    }

    @Override
    public void run(){
        while (index < max) {
            System.out.println(Thread.currentThread() + "   当前的号码是 ： " + index++ );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

