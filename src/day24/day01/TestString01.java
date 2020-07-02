package day24.day01;

import java.nio.charset.Charset;

public class TestString01 {
    public static void main(String[] args) {
        String  str=new String();
        System.out.println(str);
        //使用带数组参数的构造方法
        byte [] bytes={45,25,69,78};
        String str1=new String( bytes);
        System.out.println(str1);
        /*
         第一参数是数组
         第二个参数是编码

         */
        String  str2=new String(bytes, Charset.forName("utf-8"));
        System.out.println(str2);
          /*
         带三个参数的构造方法
           第一个但是是数组
           第二个参数是数组的起始位置
           第三个参数是结束位置

           */
        String  str3=new String(bytes, 1, 2);
        System.out.println(str3);
        /*

        String(String original)
          初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
       String(StringBuffer buffer)

StringBuffer:字符串缓冲区
         */
        String   msg=new String("admin");
        System.out.println(msg);

        StringBuffer  stringBuffer=new StringBuffer();
        String   msg1=new String(stringBuffer);
        System.out.println(msg1);

    }
}
