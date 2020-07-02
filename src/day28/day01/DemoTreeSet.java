package day28.day01;

import java.util.TreeSet;
/*
TreeSet集合只能同一类型的数据

 */
public class DemoTreeSet {
    public static void main(String[] args) {
        TreeSet  treeSet=new TreeSet();
        Perosn  perosn=new Perosn();
        treeSet.add(perosn);
      /*  treeSet.add("admin");
       treeSet.add("123");*/
        System.out.println(treeSet);
    }
}
