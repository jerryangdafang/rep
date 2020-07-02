package day14.day02;

public class Car {
    int  age;
    String  name;
    //无返回值的方法
    public  void   m(){
        System.out.println("这里是无返回值的方法");
    }
    //有返回值的方法
    public  int   m1(){
        System.out.println("这里是有返回值的方法");
        return  2;
    }
   //有参数的方法
    public   void  m2(int  a){//这里的a是形参
          age=a;
        System.out.println("这里是有一个参数的方法");
    }

    //有两参数的方法
    public   void  m3(int  a,String  n){//这里的a是形参
        //age=a;
        name=n;
        System.out.println("这里是有一个参数的方法");
    }


}
