package day19.day02.work1;
/*

  继承Transport
  添加两个属性，车轮数(wheels,int)，车重量(weight,float)
  添加两个get方法，能够取得两个新添加属性的值
  一个构造方法，调用父类的构造方法，并且能够初始化新添加的两个属性
  一个show()方法，调用父类的show()方法打印speed和load两个属性，调用新添加的两个get方法取得wheels和weight属性的值并打印

 */
public class Vehicle extends   Transport {
    //车轮数
     int wheels;
     //车重量
      float weight;
   public   Vehicle(){
       super();
       weight=6;
       wheels=8;
   }
    public int getWheels() {
        return wheels;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(getWeight()+" "+getWheels());

    }
}
