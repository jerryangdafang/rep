package day29.day01;

import java.util.ArrayList;
import java.util.List;
/*
泛型：就是用来约束集合存储的数据类型
如果没有写泛型，那么默认就是Object
 */
public class DemoTest {
    public    static void main(String[] args) {
        List<String>  list=new ArrayList<String>();
        //list.add(12);
        list.add("admin");
        List<Double>  list1=new ArrayList<Double>();
        List<Byte>  bytes=new ArrayList<Byte>();
        List<Short>  shorts=new ArrayList<Short>();
        List<Integer>  in=new ArrayList<Integer>();
        list1.add(12.4);
       // list1.add("");约束
    }
}
