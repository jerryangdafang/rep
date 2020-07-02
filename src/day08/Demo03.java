package day08;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        //1
        int  arr[]=new  int[10];
        //2
        int arr1[]={87,12,25,10,45,78};
        //3
       // int   arr2[]=new  int[]{23,45};
        //赋值
        arr[0]=123;
        //遍历
       for (int i = 0; i <arr1.length ; i++) {
            //冒泡排序
            for (int j = 0; j <i-1; j++) {
                if (arr1[j]>arr1[j+1]){
                    int tem=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=tem;
                }
            }
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
