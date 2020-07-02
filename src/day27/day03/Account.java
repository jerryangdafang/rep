package day27.day03;
/*
创建一个账户Account类，

 */
public class Account {
    //该类有id:
    Integer  id;
    // 账户号码(长整数),
    // password:账户密码,
    String password;
    // name:真实姓名,
    String name;
    // personId:身份证号码 字符串类型,
    String  personId;
    // email:客户的电子邮箱,
    String email;
    // balance:账户余额.方法:
    double   balance;
    // deposit: 存款方法,参数是double型的金额;
    public   void deposit(double   balance){
        this.balance+=balance;
    }
    // withdraw:取款方法,参数是double型的金额.
    public   void withdraw(double   balance){
        this.balance-=balance;
    }
    // 构造方法:有参和无参,有参构造方法用于设置必要的属性


    public Account() {
    }

    public Account(Integer id, String password, String name, String personId, String email, double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.personId = personId;
        this.email = email;
        this.balance = balance;
    }
}
