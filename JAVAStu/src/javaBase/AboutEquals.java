package javaBase;

/**
 * @author houbj
 * @date 2019/10/30 14:38
 */
public class AboutEquals {
    public static void main(String args[]) {
        String line1 = "line";
        String line2 = "line";
        System.out.println(line1 == line2);  // true
        System.out.println(line1.equals(line2)); //true

        String line3 = new String("line");
        System.out.println(line1 == line3);  // false
        System.out.println(line1.equals(line3)); // true

        Student s1 = new Student("liming");
        Student s2 = new Student("liming");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //false

    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
