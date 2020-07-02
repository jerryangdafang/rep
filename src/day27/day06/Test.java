package day27.day06;

public class Test {
    public static void main(String[] args) {
        RedBuble  redBuble=new RedBuble();
        GreenBuble  greenBuble=new GreenBuble();
        Lamp  lamp=new Lamp();
        lamp.buble=greenBuble;
        lamp.on();
    }
}
