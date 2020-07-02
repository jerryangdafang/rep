package day10.day02;

/**
 * 方法的定义
 *   格式
 *     [修饰]   返回值类型  方法名称（[参数类型  参数名称]）{
 *          [返回值]
 *
 *     }
 *
 */
public class Card {
    //创建属性
    String type;
    int number;
    double  money;
     //无返回值无参数的方法
    public  void     show (){
        //方法体：  变量   选择，循环，对象，。。

        //输出属性
        System.out.println(type);
        System.out.println(number);
        System.out.println(money);

    }

}
