package day05;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* for (int i = 0; i < 100; i++) {
           int a=12;
            System.out.println(a);
        }*/



       /* for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i="+i+" j="+j);
            }
        }*/

        //求1~100之间不能被3整除的数之和
        int  sum=0;
        for (int i = 1; i <=100 ; i++) {
            if (i % 5 != 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
        //1~10之间的整数相加，得到累加值大于20的当前数
        int conut=0;
        for (int i = 1; i <=10 ; i++) {
            if (conut>=20){

                System.out.println(i);
                break;
            }
            conut+=i;

        }

        //求1~10之间的所有偶数和
        sum=0;
        for (int i =1; i <=10 ; i++) {
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
