package day28.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//注意：集合只能存储引用数据类型
public class DemoArrayList01 {
    public static void main(String[] args) {
        ArrayList   list=new ArrayList();
        //添加元素
        list.add("admin");
        list.add("admin1");
        System.out.println(list);
        //将指定的元素插入此列表中的指定位置。
        list.add(0,"user");
        System.out.println(list);
        //自动装箱
        list.add(12);//这里可以存储基本数据类型的12是因为自动装箱为引用数据类型
        System.out.println(list);
        //移除此列表中的所有元素l
      //  list.clear();
        System.out.println(list);
        //  返回此 ArrayList 实例的浅表副本。
        Object clone = list.clone();
        System.out.println(clone);
        //  如果此列表中包含指定的元素，则返回 true。
        boolean contains = list.contains(112);
        System.out.println(contains);
        // 如有必要，增加此 ArrayList 实例的容量，以确保它至少能够容纳最小容量参数所指定的元素数。
        list.ensureCapacity(1);
        System.out.println(list);

        //返回此列表中指定位置上的元素。
        Object o = list.get(2);
        System.out.println(o);
        // 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
        int admin = list.indexOf("admin");
        System.out.println(admin);
        //如果此列表中没有元素，则返回 true
        boolean empty = list.isEmpty();
        System.out.println(empty);
        // 移除此列表中指定位置上的元素。
       // list.remove(1);//当元素是整数的时候使用下标删除
        System.out.println(list);
       // list.remove("admin1");
        System.out.println(list);
        //用指定的元素替代此列表中指定位置上的元素。
        list.set(1,"ss");
        System.out.println(list);
        // 返回此列表中的元素数。
        System.out.println(list.size());
        // 按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
        //截取
        List list1 = list.subList(1, 2);
        System.out.println(list1);


    }
}
