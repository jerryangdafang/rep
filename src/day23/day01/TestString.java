package day23.day01;

/*
 String是一个特殊类：
    不可以使用常量来表示，也可以使用变量来表示


 */

public class TestString {
    public static void main(String[] args) {
         String  str="admin";
         String  str1="admin";
         String  str2=new String("admin");
         String  str3=new String("admin");
        System.out.println(str==str1);//true
//        System.out.println(str==str2);//false
        System.out.println(str2==str3);//false
        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str2));//true
        System.out.println(str3.equals(str2));//true

    }
}
