package lang.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};
        size(objects);
    }

    public static void size(Object[] object){
        System.out.println("전달된 객체의 수는: " + object.length);
    }
}
