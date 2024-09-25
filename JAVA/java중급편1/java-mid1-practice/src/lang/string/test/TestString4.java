package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String tmp1 = str.substring(0,5);
        String tmp2 = str.substring(5,9);
        System.out.println("filename = " + tmp1);
        System.out.println("extName = " + tmp2);
    }
}
