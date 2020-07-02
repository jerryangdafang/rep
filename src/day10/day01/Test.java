package day10.day01;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Car car=new Car();
        //属性赋值
        car.type="法拉利";
        car.number=8;
        car.money=450.6;
        //访问属性
        System.out.println(car.money);
        System.out.println(car.type);
        System.out.println(car.number);

    }
}
