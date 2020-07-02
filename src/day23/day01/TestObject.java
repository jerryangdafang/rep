package day23.day01;

public class TestObject {

    public static void main(String[] args) {
        Object onj = new Object();
        Object onj1 = new Object();
        /*
          ==用途equals的区别：
            1==
               1可以比较基本数据类型
               2可以比较引用数据类型 ，比较的是地址
            2equals
               1只能比较引用数据
                   1可以比较地址
                   2可以比较内字符串：但是比较字符串时候，必须重写


         */
        System.out.println(onj.equals(onj1));//在object中只能比较地址，这个方法一般都要重写
        System.out.println(onj == onj1);
        System.out.println(2 == 1);
        System.out.println(onj.getClass());
        // 返回该对象的哈希码值。
        System.out.println(onj.hashCode());
        // 返回该对象的字符串表示。
        System.out.println(onj.toString());
        System.out.println(onj);
        System.out.println("----------------------------------------");
        Student  student=new Student();
        student.setAge(20);
        student.setName("admin");
        Student  student1=new Student();
        student1.setAge(21);
        student1.setName("admin");


        System.out.println(student.equals(student1));
        System.out.println("------------------------");
        System.out.println(student);



    }
}


