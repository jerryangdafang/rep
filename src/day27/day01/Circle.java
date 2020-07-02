package day27.day01;
/*
创建一个圆Circle类，为该类提供两个方法，方法一用于求圆的面积，方法二用于求圆的周长
，同时为该类提供一个变量r表示半径，一个常量PI表示圆周率。为该类提供一个无参的构造方法，
用于初始化r的值为1；且提供一个有参的构造方法，参数用于初始化半径r的值
 */
public class Circle {
    double  r;
    final  double  PI=3.14;
    public   void mj(){
        System.out.println(PI*r*r);
    }
    public   void zc(){
        System.out.println(PI*r*2);
    }
    public   Circle(){
        r=1;
    }
    public   Circle(double r){
        this.r=r;
    }
}
