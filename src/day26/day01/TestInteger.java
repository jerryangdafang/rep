package day26.day01;

public class TestInteger {
    public static void main(String[] args) {
        //
        int n=45;
        //创建对象
        Integer  in=new Integer(n);
        Integer  in1=new Integer("123");
        System.out.println(in);
        //将int类型转byte类型
        byte b = in.byteValue();
        System.out.println(b);
        //将字符串转整数
        Integer decode = Integer.decode("4123");
        System.out.println(decode);
        // 以 double 类型返回该 Integer 的值。
        System.out.println(in.doubleValue());
        //  以 float 类型返回该 Integer 的值。
        System.out.println(in.floatValue());
        //将字符串参数作为有符号的十进制整数进行解析
        System.out.println(Integer.parseInt("123"));//字符串转整数

        Double  d=new Double("123");
        System.out.println(d.isNaN());



    }
}
