package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        int  arr[]=new int[10];
        //键盘扫描器
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=10; i++) {
            System.out.println("请输入第"+i+"个顾客的年龄");
            arr[i-1]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
          int   count=0;
        //数组的遍历
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=30){
                count++;
            }

        }
        System.out.println(count);
        System.out.println("30以上的比例是："+(count/10.0)*100+"%");
        System.out.println("30以下的比例是："+((10-count)/10.0)*100+"%");
    }
}
