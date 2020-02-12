package javaBase;

import java.io.Console;
import java.util.Scanner;

/**
 * @author houbj
 * @date 2019/11/25 21:42
 */
public class AboutConsole {
    public static void main(String [] args) {
        Console con = System.console();

//        String name = con.readLine("username:");//

        Scanner in = new Scanner(System.in);

        String  name1 = in.nextLine();
        System.out.println(name1);
//        System.out.println(name);
    }
}
