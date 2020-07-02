package day14.day01;
/*
变量分类：
    全局变量：就是属性
       定义类中方法外
        特点：
           1作用域为整个类
           2可以在类的外部使用
           3可以不用初始值，因为系统默认提供
    局部变量
        定义在方法中
        特点：
           1作用域为整个方法，离开方法就失效
           2必须赋值

 */
public class Card {
    //属性
      int  age;
      public  void  m(){
          //变量
          int  a=7;
          System.out.println(a);
          System.out.println(age);
      }


}
