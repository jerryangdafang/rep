package day25.day01;


public class TestString {
    public static void main(String[] args) {
        System.out.println("a");
        //\\ 反斜线字符
        System.out.println("\\");
        String  msg="a";
        //[abc] a、b 或 c（简单类）
        System.out.println(msg.matches("[abc]"));//a、b 或 c（简单类）
        //[^abc] 任何字符，除了 a、b 或 c（否定）
        System.out.println(msg.matches("[^abc]"));//除了 a、b 或 c（否定）
        //[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
        System.out.println(msg.matches("[a-zA-Z]"));//除了 a、b 或 c（否
        //[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集）
        //[a-z&&[def]] d、e 或 f（交集）
        //[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
        //[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）
//        System.out.println(msg.matches("[abc]"));/

        System.out.println(msg.matches("[a-z&&[^m-p]]"));
        //预定义字符类
        //. 任何字符（与行结束符可能匹配也可能不匹配）
        //\d 数字：[0-9]
        //\D 非数字： [^0-9]
        //\s 空白字符：[ \t\n\x0B\f\r]
        //\S 非空白字符：[^\s]
        //\w 单词字符：[a-zA-Z_0-9]
        //\W 非单词字符：[^\w]
        String  str="a";
        System.out.println(str.matches("\\d"));//判断是否是数字
        System.out.println(str.matches("[0-9]"));//判断是否是数字
        System.out.println(str.matches("\\D"));
        System.out.println(str.matches("[^0-9]"));//
        //边界匹配器
        //^ 行的开头
        //$ 行的结尾
        //\b 单词边界
        //\B 非单词边界
        //\A 输入的开头
        //\G 上一个匹配的结尾
        //\Z 输入的结尾，仅用于最后的结束符（如果有的话）
        //\z 输入的结尾
        String  str1="a";
        System.out.println(str1.matches("^a"));//是否是以a开头
        System.out.println(str1.matches("a$"));//是否是以a开头
        //    Greedy 数量词
        //    X? X，一次或一次也没有
        //    X* X，零次或多次
        //   X+ X，一次或多次
        //   X{n} X，恰好 n 次
        //   X{n,} X，至少 n 次
        //  X{n,m} X，至少 n 次，但是不超过 m 次
        String  str2="aaa";
        System.out.println(str2.matches("a?"));//一次或一次也没有
        System.out.println(str2.matches("a*"));//零次或多次
        System.out.println(str2.matches("a+"));//一次或多次
        System.out.println(str2.matches("a{2}"));//恰好 n 次
        System.out.println(str2.matches("a{2,}"));//至少 n 次
        System.out.println(str2.matches("a{2,3}"));//至少 n 次
        String  str3="admin";
        System.out.println(str2.matches("^a+"));//一次或多次
        //18125469871
        String  str4="17125469871";
        System.out.println(str4.matches("^1[578][0-9]{9}"));//一次或多
        System.out.println(str4.matches("^1[578]\\d{9}"));//一次或多
        //    final String pattern1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        //    final String pattern1 = "^(\\w+[-|\\.]?)+\\w@(\\w+(-\\w+)?\\.)+\\w{2,}$";
        /**
         * u23654@qq.com
         *
         *
         */
        String  req="\\w+@[a-z]{2}.[a-z]{3}";
        System.out.println("1564@qq.com".matches(req));
    }
}
