package day17.day02;
/*
重载：在同一个类中，方法名称相同，参数个数或者参数类型不同，方法的重载与返回值无关系
重写：在子类中定义父类已有方法，就是方法的重写
  注意：
     1方法名称，参数个数和参数类型必须和父类保持一致；
     2修饰必须大于或者等于父类
  重写的目的：
      因为父类的功能无法满足子类的需求

 */
public class Dog  extends   Pet{

  /*  public   void  m1(){}
    public   void  m1(int  age){}
    public   void  m1(String  n){}*/

    @Override
   public   void m() {
        //调用父类
        super.m();
        System.out.println("扫描登录");
    }
}
