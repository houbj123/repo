package javaBase;

import java.util.*;

/**
 * @author houbj
 * @date 2019/10/31 20:41
 */
public class AboutCollection {
    public static void main(String args[]) {

        Collection<String> str = new ArrayList<String>();
        str.add("hello world1");
        str.add("hello world2");
        str.add("hello world3");
        str.add("hello world4");

        Iterator<String> iter = str.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for(String element: str) {
            System.out.println(element);
        }

        /**
         * collection 有两个基本的方法：
         *
         *
         */

//        LinkedList
        LinkedList<String> strings = new LinkedList<>();
        strings.add("111");
        strings.add("222");
        strings.add("333");
        strings.add("444");
        strings.add("555");
        ListIterator<String> li = strings.listIterator();

        if (li.hasNext()){
            li.next();
            System.out.println(li.next());
            li.add("0000");
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
