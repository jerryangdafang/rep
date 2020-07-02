package day20.day01;
//如果一个普通类取继承抽象类后必须重写里面的抽象方法为普通方法
public class Dog extends  Pet {
    @Override
    public void eat() {
        System.out.println("--------------dog---eat..........");
    }

    public void sleep() {
        System.out.println("--------------sleep---eat..........");
    }

}
