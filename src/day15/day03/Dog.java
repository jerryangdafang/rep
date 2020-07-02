package day15.day03;
/*
参数名称和属性名称可以相同，当参数名称和属性名称相同的时候用this来区分
this作用：代表当前类的一个实例
     1区分属性或者说调用属性:
     格式：this.属性名称
     2调用方法，
        this.方法([参数初始化])
     3调用构造方法：
        格式：this([参数初始化]):注意，调用构造方法必须放第一行


 */
public class Dog {
    public    String name;
    public    int health;
    //定义无参数的构造方法
       public  Dog(){
           this(40);//调用有参数的构造方法，必须第一行
            System.out.println("无参数的构造方法");
        }

    public  Dog(int  health){
        this.health=health;//给属性赋值
        System.out.println("1个参数的构造方法");
    }


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
