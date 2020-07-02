package day09;
/*
类的定义 ：
    [修饰符]  class  类名{
        1属性：就是变量，定义在类中方法外
           变量的声明格式：
            数据类型   变量名称[=值]；
               数据类型分类：
                  1基本数据类型（8种）
                     a整数类型
                          byte  2^8-1  127
                          short
                          int   默认值
                          long     l或者L
                     b小数类型
                          float    f或者F
                          double  默认值
                     c布尔类型
                         boolean  false(假)/true(真)
                     d字符
                         char      '',只能一个值
                  2引用数据类型
                      String,类，数组等
        2方法
    }
        特点：类名首字母必须大写
 */
 public class Car {
     //属性的定义
     int  age;
     String  name;

    public static void main(String[] args) {
        /*
         类的使用
         格式：
           类名   变量名称或者对象名称=new  类名()
         */
        //创建对象
        Car  s=new Car();
        //属性的使用  格式：对象名.属性名
        System.out.println(s.age);
        //给属性赋值
        s.age=20;
        System.out.println(s.age);


    }
}
