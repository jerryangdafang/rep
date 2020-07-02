package day12.day03;

public class Customer {
    //小数类型
    double  jf;
    //字符串
    String  type;
    public  void  show(){
        //判断
        if ((type.equals("金卡")&&jf>1000)|| (type.equals("普通卡")&&jf>5000)){
            System.out.println("卡的类型是："+type+" 积分是："+jf );
            System.out.println("获得回馈积分500");
        }else {

            System.out.println("卡的类型是："+type+" 积分是："+jf );
        }

    }
}
