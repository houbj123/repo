package javaBase;

import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 * @author houbj
 * @date 2019/11/27 22:11
 */
public class AboutPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar>  pq = new PriorityQueue<>();

        pq.add(new GregorianCalendar(1997, Calendar
                .DECEMBER, 6));
        pq.add(new GregorianCalendar(1996, Calendar.DECEMBER, 9));
        pq.add(new GregorianCalendar(1995, Calendar.DECEMBER, 9));
        pq.add(new GregorianCalendar(1993, Calendar.DECEMBER, 23));
        pq.add(new GregorianCalendar(1997, Calendar.JULY, 9));

        System.out.println("-----------------");

        for (GregorianCalendar p : pq) {
            System.out.println(p.get(Calendar.YEAR));
        }
        System.out.println("-----------------");

        while (!pq.isEmpty()) {
            System.out.println(pq.remove().get(Calendar.YEAR));
        }

//        Collections.syn
    }
}
