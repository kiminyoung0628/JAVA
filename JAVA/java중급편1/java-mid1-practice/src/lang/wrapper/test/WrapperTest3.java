package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer = Integer.valueOf(str);
        System.out.println("integer1 = " + integer);
        int i1 = integer.intValue();
        System.out.println("integer2 = " + i1);
        Integer integer1 = Integer.valueOf(i1);
        System.out.println("integer3 = " + integer1);

    }
}
