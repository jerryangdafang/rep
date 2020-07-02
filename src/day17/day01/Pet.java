package day17.day01;

public class Pet {

    String   name;
   // private   String  sex;私有的只能是本类使用
    int  age;
    public  Pet(){
        System.out.println("这里是pet构造方法1");
    }
  public   Pet(int  a){
      System.out.println("这里是pet构造方法2");
  }
    private   void  m1(){

    }
   public    void  m(){

        System.out.println("-------------这里是pet的m方法------");

    }
}
