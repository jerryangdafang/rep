package day27.day07;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        /*






4. String s = "113@ ere qqq yyui"
   请输出所有子串
   113
   ere
   qqq
   yyui


6.String s=”name=zhangsan age=18 classNo=090728”;
  将上面的字符串拆分，结果如下:
   zhangsan  18  090728

         */
        //
        //1. 编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子串”DK” 并输出到屏幕
         String   sdk="jdk";
        String s = sdk.toUpperCase();
        String s1 = s.substring(1);
        System.out.println(s1);

        //2.编写程序将String类型字符串”test” 变为 “tset”.
        String  s2="test";
        StringBuffer  bf=new StringBuffer(s2);
        bf.reverse();
        System.out.println(bf.toString());

      //  3. 写一个方法判断一个字符串是否对称
        System.out.println(m("12321"));
        //4. String s = "113@ ere qqq yyui"
        //   请输出所有子串
        //   113
        //   ere
        //   qqq
        //   yyui
        String  s3="113@ ere qqq yyui";
        s3 = s3.replace("@", "");
        String[] split = s3.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        //5. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        //	“To be or not to be"，将变成"oT eb ro ton ot eb."。
        String s4="To be or not to be";
        String[] s5 = s4.split(" ");
              StringBuffer   stringBuffer=new StringBuffer();
        for (int i = 0; i <s5.length ; i++) {
            StringBuffer   str=new StringBuffer(s5[i]);
            str.reverse();
            stringBuffer.append(str);
            if (i==s5.length-1){
                stringBuffer.append(".");
            }else {
                stringBuffer.append(" ");
            }

        }
        System.out.println(stringBuffer);
        //6.String s=”name=zhangsan age=18 classNo=090728”;
        //  将上面的字符串拆分，结果如下:
        //   zhangsan  18  090728
        String s6="name=zhangsan age=18 classNo=090728";
        String[] s7 = s6.split(" ");
        System.out.println(Arrays.toString(s7));
       for (int i = 0; i <s7.length ; i++) {
            String[] split1 = s7[i].split("=");
           System.out.println(split1[1]);
        }
    }

    public   static   boolean  m(String msg){
        StringBuffer sb=new StringBuffer(msg);
        sb.reverse();
         return  msg.equals(sb.toString());
    }
}
