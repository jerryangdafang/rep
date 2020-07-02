package day25.day01;
/*
StringBuffer是一个可变字符缓冲区

 */
public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer  sb=new StringBuffer();
        StringBuffer  sb1=new StringBuffer("admin");
        System.out.println(sb1);
       sb1.append("user");
        System.out.println(sb1);
        //   返回当前容量。
        int capacity = sb1.capacity();
        System.out.println(capacity);
        System.out.println(sb.capacity());
       //charAt(int index)
       // 返回此序列中指定索引处的 char 值。
        char c = sb1.charAt(1);
        System.out.println(c);
        //delete(int start, int end)
        //          移除此序列的子字符串中的字符。
        StringBuffer delete = sb1.delete(1, 2);
        System.out.println(delete);
        System.out.println(sb1);
        //     返回第一次出现的指定子字符串在该字符串中的索引。
        int m = sb1.indexOf("m");
        System.out.println(m);
        //insert(int offset, String str)
        //          将字符串插入此字符序列中。
        sb1.insert(1,"UUUU");
        System.out.println(sb1);
        //reverse()
        //          将此字符序列用其反转形式取代。
        sb1.reverse();
        System.out.println(sb1);



    }
}
