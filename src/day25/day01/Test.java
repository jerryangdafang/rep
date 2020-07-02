package day25.day01;
/*
String,StringBuilder,StringBuffer的区别
   String是一个不可改变长度的字符序列
  StringBuffer，StringBuffer：可变成字符序列，执行效率比String高，在使用输出和输入流的时候使用
  StringBuilder,StringBuffer的区别
  StringBuffer：线程安全的，执行率低
  StringBuilder：线程不安全的，执行率高
 */
public class Test {
    public static void main(String[] args) {
         String  s=new String("admin");
         String ss=s.concat("user");//追加    因为是不可改变长度的，所以每次追加都有重新开辟空间
         System.out.println(ss);
         StringBuffer  bf=new StringBuffer("admin");
         bf.append("user");//追加
         System.out.println(bf);
    }
}
