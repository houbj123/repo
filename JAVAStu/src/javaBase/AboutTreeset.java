package javaBase;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author houbj
 * @date 2019/11/27 19:44
 */
public class AboutTreeset {
    public static void main(String[] args) {
        SortedSet<String> strings = new TreeSet<>();

        strings.add("222");
        strings.add("111");
        strings.add("333");

        for (String s: strings) {
            System.out.println(s);
        }
    }
}
