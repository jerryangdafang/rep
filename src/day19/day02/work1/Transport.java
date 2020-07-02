package day19.day02.work1;

public class Transport {
    //速度
    int speed;
    //载重量
    float load;

    public   Transport(){
        speed=340;
        load=8.2F;
    }

    public int getSpeed() {
        return speed;
    }

    public float getLoad() {
        return load;
    }
    public   void show(){
        System.out.println(getLoad()+"  "+getSpeed());
    }
}
