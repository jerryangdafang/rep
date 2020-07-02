package day17.day01;
/*

extends  继承关键字
格式：
  子类  extends  父类
    特点：
     1在子类中可以调用父类中非私有的属性和方法
     2当父类有参数的构造方法的时候，子类必须定义一个与父类相同的参数类型的构造方法，并且使用super关键字调用,
      如果有无参数构造方法，那么子类可以不用定义构造方法

      this:代表当前类的一个对象
          作用：
             1区分属性
                 格式：this.属性名称=参数名称
             2调用普通方法
                 格式:this.方法名称([参数初始化])
             3调用构造方法：必须放第一行
                  格式：this([参数初始化])

    super:代表当前类的父类的一个对象
         作用：
             1区分父类属性
                 格式：super.属性名称=参数名称
             2调用父类普通方法
                 格式:super.方法名称([参数初始化])
             3调用父类构造方法：必须放第一行
                  格式：super([参数初始化])


 */
public class Dog  extends  Pet {
     public   Dog(){
         //定义父类构造方法
        // super();


     }

    public   Dog(String  name){
        //定义父类构造方法
        super(2);


    }

    @Override
    public void m() {
         //调用父类的普通方法
         super.m();
        System.out.println("这里是dog..m");
    }
}
