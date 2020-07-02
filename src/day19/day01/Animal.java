package day19.day01;

/**
 * 抽象类：由abstract修饰的类
 * 特点：
 *    1不能创建对象
 * 抽象方法： 由abstract修饰的方法
 *    特点：
 *       1没有方法体
 *  如果一个类继承抽象类后必须改写里面的抽象方法为普通方法
 *  如果父类可以由多个子类继承，一个子类只能由一个父类
 *
 */
public  abstract  class  Animal {
    public    void m(){
        System.out.println("----------animal----");
    }
    //抽象方法
    public abstract    void m1();
}
