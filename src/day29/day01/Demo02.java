package day29.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
          int  []a={12,35,58,1};
          String s[]={"s","a"};
        Arrays.sort(a);//排序
        System.out.println(Arrays.toString(a));
        ArrayList  list=new ArrayList();
        list.add(23);
        list.add(2);
        list.add(256);
        list.add(1);
        //工具类排序
        Collections.sort(list);
        System.out.println(list);
    }
}
