package _05_accces_modifier_static.exercise.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);
        student1.setName("Kirv");
        student1.setClasses("C03");
        System.out.println(student1);
    }
}
