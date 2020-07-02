package day15.day02;
/*
构造方法：
   定义格式：
       [修饰符] 类名([参数类型   参数名称]){}
构造方法的作用：
    1创建对象，如果没有创建如何一个构造方法的时候，那么系统会默认提供一个无参数的构造方法，为了一个类简单的实例化，如果定义构造方法后，系统不在提供构造方法
    2给属性赋值


 方法的重载：在一个类种，方法名称相同，参数个数或者参数类型不同。注意：方法的重载与返回值无关
 */
public class Dog {
    public    String name;
    public    int health;
    //定义无参数的构造方法
       public  Dog(){
            System.out.println("无参数的构造方法");
        }

    public  Dog(int  a){
        health=a;//给属性赋值
        System.out.println("1个参数的构造方法");
    }




    //--------------------------
    public  void  m(){
        System.out.println(name+"是可爱的。。。。");
    }
    //方法的重载
    public  void  m(int n){
        System.out.println(name+"是可爱的。。。。");
    }
    //方法的重载
    public  void  m(String n){
        System.out.println(name+"是可爱的。。。。");
    }

}
