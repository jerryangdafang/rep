package day16.day01;

public class Test {
    public static void main(String[] args) {
        //第一个对象
        Student  student=new Student();
        //给第一个对象赋值
        student.age=123;
        student.name="admin";
          int   a=3;
        System.out.println(Student.name);//静态属性可以直接类名调用  ，那么name属性就可以称呼为类属性
        System.out.println(student.name);//静态属性也可以对象名调用
        System.out.println(student.age);//非静态属性必须对象名调用 ，age称呼为实例属性
        //第二个对象
        Student  student1=new Student();
        //没有给第二个对象赋值
        System.out.println(student1.name);//
        System.out.println(student1.age);//
        //这里都说是对象名调用
        student.m();//非静态方法调用
        student.m1();//静态方法调用
        //类名调用
       // Student.m();非静态方法不能类名调用
        Student.m1();



    }
}
