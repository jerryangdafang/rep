package day13;

public class Card {
    //数据类型  变量名称；
    String  name;
    int  age ;
    String sex;
    //m是方法名
    public  void  m(){
        int   a=3;
        int  a1=3;

        System.out.println(  a+a1);
        System.out.println("这里是没有返回值的方法");
    }
    /*

    有返回值的方法
      八大基本数据类型
       byte,short,int ,long
       float,double
       char
       boolean  值：false/true
      引用数据类型
     */

    public   int  m1(){
        System.out.println("这里是有返回值的方法");
        int   a=3;
        int  a1=3;

        return   a;
    }

}
