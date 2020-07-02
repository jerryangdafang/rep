package day20.day01;

public class Animal {

  /*  public   void  m(Dog  pet){
        pet.eat();
    }
    public   void  m(Pig  pet){
        pet.eat();
    }*/


  public   void  m(Pet  pet){
      if (pet  instanceof   Dog){
          //向下转型
          Dog dog= (Dog) pet;
          dog.eat();
          dog.sleep();
      }
      if (pet  instanceof   Pig){
          //向下转型
          Pig dog= (Pig) pet;
          dog.eat();
      }


  }


  public  Pet  m1(){
      Pig pig = new Pig();
      return  pig;
  }

}
