package javaBase;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author houbj
 * @date 2019/12/4 17:18
 */
public class AboutLambda {
    public static void main(String[] args) {
        List<String> li = new LinkedList<String>();
        li.add("num 1");
        li.add("num 2");
        li.add("num 3");
        li.add("num 4");
        li.add("num 5");

        li.forEach(System.out::println);

        li.forEach(value -> System.out.println(value));
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("start run ");
            }
        };
        new Thread(runnable) .start();

        int test = 1;

        new Thread(()-> {System.out.println(test); }).start();


        Apple a1 = new Apple("red", "red", 200);
        Apple a2 = new Apple("yellow", "yellow", 180);
        Apple a3 = new Apple("blue", "blue", 300);
        Apple a4 = new Apple("white", "white", 290);
        Apple a5 = new Apple("perple", "perple", 150);
        List<Apple> appleList = Arrays.asList(a1, a2, a3,a4,a5);

        appleList.sort(Apple::compareByWeight);

        appleList.forEach(apple -> System.out.println(apple.toString()));

    }


}

class Apple {
    private String name;
    private String color;
    private double weight;


    public Apple(){}


    public Apple(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }


    public static int compareByWeight(Apple a1 , Apple a2) {
        double diff =  a1.getWeight() - a2.getWeight();
        return new Double(diff).intValue();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
