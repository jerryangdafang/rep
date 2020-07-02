package day28.day01;

import java.util.LinkedList;

/*
  list:有序可重复


 */
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList  linkedList=new LinkedList();
        // 将指定元素添加到此列表的结尾。
        linkedList.add("admin");
        //  将指定元素插入此列表的开头。
        linkedList.addFirst("user");
        //  将指定元素插入此列表的结尾。
        linkedList.addLast("name");
        linkedList.addLast("name");
        System.out.println(linkedList);

    }
}
