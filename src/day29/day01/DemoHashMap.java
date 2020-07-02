package day29.day01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap  hashMap=new HashMap();
        //          从此映射中移除所有映射关系。
        hashMap.clear();
        System.out.println(hashMap);
        //存储元素
        hashMap.put("name","admin");
        hashMap.put("pwd","123123");
        //存储重复的键：说明键不能重复
        hashMap.put("pwd","13456");
        System.out.println(hashMap);
        //存储重复的值:值是可以重复的
        hashMap.put("sex","13456");
        System.out.println(hashMap);
        //null
        hashMap.put(null,"111");
        hashMap.put("a",null);
        hashMap.put("b",null);
        System.out.println(hashMap);
        //获取值
        Object name = hashMap.get("name");
        System.out.println(name);
        //删除元素，通过键删除
        hashMap.remove("name");
        System.out.println(hashMap);
        //集合长度
        int size = hashMap.size();
        System.out.println(size);
        //获取所有的键
        Set set = hashMap.keySet();
        System.out.println(set);
        //获取所有的值
        Collection values = hashMap.values();
        System.out.println(values);



    }
}
