package day19.day02.work4;

import java.security.spec.RSAOtherPrimeInfo;

/*
  说明二：关于SoldCard
  继承Card
  添加属性，汽车价格(price,double)，汽车出厂的年(reachYear,int)、月(reachMonth,int)、日(reachDay,int)，客户名称(clientName,String)，汽车类型(cardType,String)，销售日期(soldDate,String)
  两个构造方法,一个默认构造方法，一个带参数的构造方法调用父类的无参的默认构造方法并且初始化类中的各个属性
  添加一个setCard方法，在此方法中调用父类的setCard方法，并且能够设置新添加的各个属性
  添加一个方法getPrice，要求只有已经连接的客户才能调用此方法，提示调用父类中的getCard方法判断客户的连接状态
  重写父类的show方法，在此方法中调用父类的show方法，并显示其他新添加的属性
  在测试类中创建Card类对象，并为对象创建卡号和密码，调用对象的连接方法进行连接，连接成功后打印对象信息。
  创建SoldCard类对象执行同上操作。
 */
public class SoldCard extends   Card {
    //汽车价格
    double price;
    //汽车出厂的年
    int reachYear;
    //月
    int reachMonth;
    //日
    int reachDay;
    //客户名称
    String clientName;
    //汽车类型
    String cardType;
    //销售日期
    String soldDate;

    public SoldCard() {

    }

    @Override
    public void show() {
        super.show();
        System.out.println(reachYear+" "+ reachMonth+" "+reachDay+"  "+clientName+"   "+cardType+"  "+soldDate);
    }

    public void  setCard(long cardNumber, int password, boolean connectFlag, double price, int reachYear, int reachMonth, int reachDay, String clientName, String cardType, String soldDate) {
         super.setCard(cardNumber,password);
        this.price = price;
        this.reachYear = reachYear;
        this.reachMonth = reachMonth;
        this.reachDay = reachDay;
        this.clientName = clientName;
        this.cardType = cardType;
        this.soldDate = soldDate;
    }

    public SoldCard(long cardNumber, int password, boolean connectFlag, double price, int reachYear, int reachMonth, int reachDay, String clientName, String cardType, String soldDate) {
        super();
        this.price = price;
        this.reachYear = reachYear;
        this.reachMonth = reachMonth;
        this.reachDay = reachDay;
        this.clientName = clientName;
        this.cardType = cardType;
        this.soldDate = soldDate;
    }
    public void  getPrice(){
        System.out.println(price);
    }
}
