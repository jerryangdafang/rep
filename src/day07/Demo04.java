package day07;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int   arr[]={-90,100,23,56,89,56};
        //排序
        Arrays.sort(arr);
/*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        //将数组转字符串
        String s = Arrays.toString(arr);
        System.out.println(s);
        //查询元素
        int i = Arrays.binarySearch(arr, 100);
        System.out.println(i);
        //获取最后一个元素
        System.out.println(arr[arr.length-1]);
    }
}
