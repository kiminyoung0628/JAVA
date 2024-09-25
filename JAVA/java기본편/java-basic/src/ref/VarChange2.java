package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println(dataA);
        System.out.println(dataB);
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        dataB.value = 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);
    }
}
