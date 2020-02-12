package javaBase;

/**
 * @author houbj
 * @date 2019/10/30 15:02
 */
public class AboutHashCode {
    public static void main(String args[]) {
        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("str1：%d | str2：%d",
                str1.hashCode(),str2.hashCode())); //str1：1179395 | str2：1179395
        System.out.println(str1.equals(str2)); // false
    }
}
