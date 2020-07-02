package day27.day04;
/*
:Square(正方形)
 不同的子类会有不同的计算周长和面积的方法
 */
public class Rect extends   Shape {
    double  l;
    double  h;

    @Override
    public void mj() {
        System.out.println(l*h);
    }

    @Override
    public void zc() {
        System.out.println((l+h)*2);
    }
}
