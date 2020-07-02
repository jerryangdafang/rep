package day19.day02.work4;

public class Card {
    /*
   个属性，卡号(cardNumber,long)密码(password,int)连接标志(connectFlag,boolean)
 三个方法, 一个方法setCard设置卡的卡号和密码，一个方法getCard传入卡号和密码的值来判断是否能够连接，
 一个方法show来显示卡的连接状态、卡号、密码
 两个构造方法,一个默认构造方法，一个带参数的构造方法并初始化类中的各个属性
 说明二：关于SoldCard
    */
    //卡号
    long cardNumber;
    //密码
    int password;
    //连接标志
    boolean connectFlag;

    public void setCard(long cardNumber,int password) {
        this.cardNumber = cardNumber;
        this.password=password;
    }
    public boolean getCard(long cardNumber,int password) {

        if (this.cardNumber==cardNumber&&this.password==password){
                connectFlag=true;
        }
        return  connectFlag;
    }

    public  void show(){
        System.out.println("连接状态："+connectFlag+" 卡号 "+cardNumber+" 密码 "+password);

    }

    public Card() {
    }

    public Card(long cardNumber, int password, boolean connectFlag) {
        this.cardNumber = cardNumber;
        this.password = password;
        this.connectFlag = connectFlag;
    }
}
