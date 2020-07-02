package day25.day01;

import java.util.Map;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        //  返回 double 值的绝对值。
        System.out.println(Math.abs(-3));
        //返回 double 值的立方根。
        System.out.println(Math.cbrt(9));
        //返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
        System.out.println(Math.ceil(5.1));
       // max(double a, double b)
      //  返回两个 double 值中较大的一个。
        System.out.println(Math.max(7,5));
        //min(double a, double b)
        //          返回两个 double 值中较小的一个。
        System.out.println(Math.min(7,5));
        //pow(double a, double b)
        //          返回第一个参数的第二个参数次幂的值。
        System.out.println(Math.pow(2,100));
        //   返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
        System.out.println((int)(Math.random()*10000));
    }
}
