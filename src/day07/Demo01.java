package day07;

import java.util.Scanner;

public class Demo01 {
    /*
    Java考试结束后，老师给张浩分配了一项任务，让他计算全班（30人）的平均分
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 数组的声明格式
         int  arr[]={12,25,85};//声明的时候赋值
        System.out.println("数组的长度为："+arr.length);
        //数组值的访问
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //替换值
        arr[1]=45;
        System.out.println(arr[1]);
        arr[1]=0;
        System.out.println(arr[1]);
        // 2
         int   arr1[]=new  int[3];//声明的时候开辟空间
        System.out.println("数组的长度:"+arr1.length);
        //给数组赋值
        arr1[0]=23;
        arr1[1]=73;
        arr1[2]=80;
      //  arr1[3]=80;
        //java.lang.ArrayIndexOutOfBoundsException: 3  数组下标越界
        System.out.println(arr1[2]);
        int   arr3[]=null;
        //java.lang.NullPointerException :空指针异常
        System.out.println(arr3[0]);

          //3
        int  arr4[]=new  int[]{12,354,56,89};



    }
}
