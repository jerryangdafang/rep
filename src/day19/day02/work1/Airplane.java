package day19.day02.work1;
/*

说明三：关于Airplane
  和说明二的要求一致，只要求新添加的两个属性为发动机类型(enginertype,String)发动机数量(enginers,int)
  最后，在测试类main方法中生成汽车类和飞机类的对象

 */
public class Airplane extends  Transport {
    //发动机类型
    String enginertype;
    //发动机数量
    int enginers;
    public  Airplane(){
        super();
        enginers=2;
        enginertype="A-20";
    }

    public String getEnginertype() {
        return enginertype;
    }

    public int getEnginers() {
        return enginers;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(getEnginers()+" "+getEnginertype());
    }
}
