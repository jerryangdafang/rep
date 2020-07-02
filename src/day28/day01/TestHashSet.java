package day28.day01;

import java.util.HashSet;
/*
set:不可重复，无序

 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet  set=new HashSet();
        Perosn perosn=new Perosn();
        set.add("admin");
        set.add("admin");
        set.add(123);
        set.add(perosn);
        System.out.println(set);
    }
}
