package day11.day01;

public class Card {
    /*
    数据类型
       1基本数据类型
          1整数
           byte  short int long
          2小数：
             float double
         3字符
            char
         4布尔类型
            boolean

       2引用数据类型
               String

     */
    int   age;
    String  name;
    String address;
    String     sex;
   //无返回值，无参数的方法
    public   void  show(){
        System.out.println(age+" "+name);
    }
    //无返回值，有参数的方法  a是形参
    public  void   m(int  a){
        age=a;
        System.out.println(age);
    }
   //void无返回值的意思
    public  void   m1(int  a,String  n){
        age=a;
        name=n;
        System.out.println(age+" "+name);
    }



}
