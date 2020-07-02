package day27.day04;
/*
Circle(圆形)

 */
public class Circle extends   Shape {
    double  r;

    @Override
    public void mj() {
        System.out.println(Math.PI*r*r);
    }

    @Override
    public void zc() {
        System.out.println(Math.PI*r*2);
    }
}
