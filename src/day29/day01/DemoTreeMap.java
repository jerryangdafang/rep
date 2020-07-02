package day29.day01;

import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();
        treeMap.put("admin","name");
        treeMap.put("admin",123);
       // treeMap.put(436,123);只能存储同一类型
        System.out.println(treeMap);

    }
}
