package day11.day01;

public class Test {
    //程序的入口
    public static void main(String[] args) {
        //类的使用，一般都说是创建对象
        Card  card=new Card();//card是对象名，自己取的
        //属性的调用  ，对象名.属性名称=值
        card.age=20;
        card.name="张三";
      /*  System.out.println(card.age);
        System.out.println(card.name);*/
        //方法的调用  对象名.方法名(),注意：方法是有括号
        card.show();
        //调用有参数的方法
        card.m(25);
        System.out.println(card.age);
        card.m1(20,"jack");//20和jack实参
       /*
        System.out.println(card.age);
        System.out.println(card.name);
        */

    }
}
