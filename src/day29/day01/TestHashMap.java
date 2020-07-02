package day29.day01;

import java.util.HashMap;
import java.util.Hashtable;

public class TestHashMap {
    public static void main(String[] args) {
        /*
        HashMap：
            1此实现不是同步的
            2键只有一个null ，值可以多个
        Hashtable
             1Hashtable 是同步的
             2键与值都不能为空
         */
        HashMap  hashMap=new HashMap();
        hashMap.put(null,"ad");
        hashMap.put(null,"admin");
        hashMap.put("a",null);
        hashMap.put("b",null);
        hashMap.put("b",new Perosn());
        hashMap.put(new Perosn(),new Perosn());
        System.out.println(hashMap);
        Hashtable  hashtable=new Hashtable();
        /*
        synchronized:同步锁
           public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
            throw new NullPointerException();
        }
         */
        hashtable.put(3,"admnin");
       // hashtable.put(null,"admnin");//不能为空
       // hashtable.put(null,"admnin");//键不能为空
       // hashtable.put("s",null);//值不能为空
        System.out.println(hashtable);
    }
}
