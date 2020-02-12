package threadTest;

/**
 *
 * 模版模式
 * @author houbj
 * @date 2019/12/4 16:09
 */
public class Test1_4_2 {

    public static void main(String[] args) {
        Test1_4_2 test = new Test1_4_2() {
            @Override
            public void methodPrint(String message) {
                System.out.println("*" + message + "*");
            }
        };
        test.print("hello test");

        Test1_4_2 test1 = new Test1_4_2() {
            @Override
            public void methodPrint(String message) {
                System.out.println("+" + message + "+");
            }
        };
        test1.print("hello test");
    }


    public final void print(String message) {
        System.out.println("***************");
        methodPrint(message);
        System.out.println("***************");
    }

    public void methodPrint(String message) {

    }
}

class TemplateMethod{

}
