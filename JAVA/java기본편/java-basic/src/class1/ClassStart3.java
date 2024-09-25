package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //객체 또는 인스턴스라고 부름
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //객체 또는 인스턴스라고 부름
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
}
