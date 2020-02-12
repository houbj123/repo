package threadTest;

/**
 * @author houbj
 * @date 2019/12/4 16:28
 */
public class Test1_4_3 {
    public static void main(String[] args) {
//        TicketWindowByThread t1 = new TicketWindowByThread(" number 1 ");
//        t1.start();
//
//        TicketWindowByThread t2 = new TicketWindowByThread(" number 2 ");
//        t2.start();
//        TicketWindowByThread t3 = new TicketWindowByThread(" number 3 ");
//        t3.start();
//        TicketWindowByThread t4 = new TicketWindowByThread(" number  4 ");
//        t4.start();

        final TicketWindowByThread task = new TicketWindowByThread();
        Thread t1 = new Thread(task, "number1");
        Thread t2 = new Thread(task, "number1");
        Thread t3 = new Thread(task, "number1");
        Thread t4 = new Thread(task, "number1");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketWindowByThread extends Thread {
//    private final String name;
    private static final int max = 50;

//    private int index = 1;
    private static int index = 1;

//    TicketWindowByThread(String name) {
//        this.name = name;
//    }
    public TicketWindowByThread(){}
    @Override
    public void run(){
        while (index < max) {
//            System.out.println("柜台 ： " + name + "  ； 当前的号码是 ： " + index++ );
            System.out.println(Thread.currentThread() + "当前的号码是 ： " + (index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
