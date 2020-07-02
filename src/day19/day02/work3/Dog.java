package day19.day02.work3;
/*
两个属性，狗的名字(dogName,String)，狗的年龄(dogAge,int)
  一个方法，dogWalk()，打印一句话简单描述狗走路的样子
  一个构造方法，无参数，在此构造方法中初始化dogName,dogAge
 */
public class Dog {
    //狗的名字
    String dogName;
    //狗的年龄
    int  dogAge;

    public  void  dogWalk(){
        System.out.println("狗走路的样子");
    }
    public  Dog(){
        dogName="小黄";
        dogAge=3;
    }


}
