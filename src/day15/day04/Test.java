package day15.day04;

public class Test {
    public static void main(String[] args) {
        Student  student=Student.getintsace1();
        Student  student1=Student.getintsace1();
        System.out.println(student.equals(student1));
        student.setName("admin");
        System.out.println(student.getName());

    }
}
