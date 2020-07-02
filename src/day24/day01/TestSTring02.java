package day24.day01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

public class TestSTring02 {
    public static void main(String[] args) {
        String  str="admin123";// a 97  b 98  c 99 d 100
        //返回指定索引处的 char 值。
        char c = str.charAt(1);
        System.out.println(c);
        //返回指定索引处的字符（Unicode 代码点）。
        int i = str.codePointAt(1);
        System.out.println(i);
        // 返回指定索引之前的字符（Unicode 代码点）。
        int i1 = str.codePointBefore(2);
        System.out.println(i1);//
        //返回此 String 的指定文本范围中的 Unicode 代码点数。
        int i2 = str.codePointCount(1, 3);
        System.out.println(i2);
        // 按字典顺序比较两个字符串。
        String  msg="Addin";// 97 98 A:65
        String  msg1="admin";// a:97 100
        System.out.println(msg1.compareTo(msg));
        //按字典顺序比较两个字符串，不考虑大小写。
        System.out.println(msg.compareToIgnoreCase(msg1));
        // 将指定字符串连接到此字符串的结尾。
        String user = msg1.concat("user");//追加
        System.out.println(user);
        // 当且仅当此字符串包含指定的 char 值序列时，返回 true。
        boolean user1 = msg.contains("A");
        System.out.println(user1);
        //  返回指定数组中表示该字符序列的 String。
        char  bs[]={'a','b','c','d','e'};
        String s = String.copyValueOf(bs);
        System.out.println(s);
        /*
         拷贝数组：bs

         */
        String s1 = String.copyValueOf(bs, 1, 3);
        System.out.println(s1);
        //测试此字符串是否以指定的后缀结束。
        boolean s2 = msg.endsWith("s");
        System.out.println(s2);
        //format(Locale l, String format, Object... args)
        //          使用指定的语言环境、格式字符串和参数返回一个格式化字符串。
        /*String format = String.format("-", "admin");
        System.out.println(format);
        Locale  locale=new Locale("java");
        String format1 = String.format(locale, "-", "20");
        System.out.println(format1);*/
        //将字符串数组
        byte[] bytes = msg.getBytes();
        System.out.println(Arrays.toString(bytes));
        //将字符串数组  并且指定编码

     String   n="你好";
            byte[] bytes1 = n.getBytes();
           // byte[] bytes1 = n.getBytes("utf-8");
            System.out.println(Arrays.toString(bytes1));


        System.out.println("-------------------------");
        //返回此字符串的哈希码
        String  msg2="absuygbjuagdty "; // s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        //  97*31^1+98*1
        System.out.println(msg2.hashCode());
    // 返回指定字符在此字符串中第一次出现处的索引。
        int i3 = msg2.indexOf("b");
        System.out.println(i3);
        // 返回指定字符在此字符串中第一次出现处的索引  几开始查找。
        int i4= msg2.indexOf("b",5);
        System.out.println(i4);
        // 当且仅当 length() 为 0 时返回 true。so
        System.out.println(msg2.isEmpty());
        //返回此字符串的长度。
        System.out.println(msg2.length());
        System.out.println(msg2);
        //replaceAll(String regex, String replacement)
        //使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。)
      //  String s3 = msg2.replaceAll("y", "YYY");
        //String s3 = msg2.replace("y", "YYY");
        String s3 = msg2.replaceFirst("y", "YYY");
        System.out.println(s3);
        //split(String regex)
        //          根据给定正则表达式的匹配拆分此字符串。
        String[] yyys = s3.split("Y");
        System.out.println(Arrays.toString(yyys));
        //   测试此字符串是否以指定的前缀开始。
        boolean a = s3.startsWith("a");
        System.out.println(a);
        //截取
       // String substring = s3.substring(3);
        String substring = s3.substring(3,6);
        System.out.println(substring);
        //将字符串转数组
        char[] chars = substring.toCharArray();
        System.out.println(Arrays.toString(chars));
        //换为小写
        String  m="AGJ";
        String s4 = m.toLowerCase();
        System.out.println(s4);
        //换为大写。
        System.out.println(s4.toUpperCase());
        //忽略前导空白和尾部空白。
        String  m1="  AGJ    ";
        System.out.println(m1+"a");
        System.out.println(m1.trim()+"a");

        String s5 = String.valueOf(34);
        System.out.println(s5+4);

    }
}
