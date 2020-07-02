package day29.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList   list=new ArrayList();
        list.add("李四");
        list.add("张三");
        list.add("王五");
        System.out.println(list);
        for ( Object obj: list) {
            System.out.println(obj);
        }
        //集合的遍历:只有有序的集合才能使用
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------");
        //iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------set--------------");
        HashSet   set=new HashSet();
        set.add("李四");
        set.add("张三");
        set.add("王五");
        System.out.println(set);
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){//判断是否包含值
            System.out.println("-----1-----"+iterator1.next());
        }
        System.out.println("--------2---------");
        for ( Object obj: set) {
            System.out.println(obj);
        }
        System.out.println("-----------map----------------");
        HashMap  map=new HashMap();
        map.put("name","admin");
        map.put("pwd","123456");
        for (Object obj: map.keySet()) {
            System.out.println("键："+obj);
            System.out.println("值  "+map.get(obj));
        }

    }
}
