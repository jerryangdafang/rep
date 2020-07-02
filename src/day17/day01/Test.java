package day17.day01;

public class Test {
    public static void main(String[] args) {
        //创建子类的对象
        Dog dog=new Dog("");
        //给属性赋值
        dog.age=20;
        dog.name="admin";
        System.out.println(dog.age);
        System.out.println(dog.name);
        //调用方法
        dog.m();
        System.out.println("-----------------------");
      //创建父类对象
        Pet   p=new Pet();
        p.m();
        System.out.println(p.age);
        System.out.println(p.name);

    }
}
