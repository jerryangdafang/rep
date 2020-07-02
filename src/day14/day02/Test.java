package day14.day02;
/*
参数的作用：
    将方法外部的值传入到方法内部
 返回值值的作用：
    将方法内部的值传入到方法外部
  参数与返回值就是对方法内外值的传递

 */
public class Test {
    public static void main(String[] args) {
        Car  car=new Car();
        car.m2(3);//传入实参
        System.out.println(car.age);//3
        car.m3(20,"admin");
        System.out.println(car.age);//20
        System.out.println(car.name);//admin
    }
}
