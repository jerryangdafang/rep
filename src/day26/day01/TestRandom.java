package day26.day01;

import java.util.Random;
/*
随机数
 */
public class TestRandom {
    public static void main(String[] args) {
        //创建对象
        Random random=new Random();
        //double的随机数
        double v = random.nextDouble();
        System.out.println(v);
        int i = random.nextInt();
        int i1 = random.nextInt(10000);
        System.out.println(i1);
    }
}
