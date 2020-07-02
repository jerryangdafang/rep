package day20.day01;

public class Test {
    public static void main(String[] args) {
        /*
          多态：
             向上转型
                  ：  子类向父类转型
              目的：为了获取子类中父类与子类共有的方法
             向上下转型：父类类型变量引用子类类型的对象向子类转型
             目的：为了获取子类中独有的方法
           父类出现的地方子类也可以出现：里氏代换原则
      if (pet  instanceof   Pig){
          Pig dog= (Pig) pet;
          dog.eat();
      }


      判断某个对象是否属于某个类型

         */
        //创建对象
        Pet  pet=new Dog();
        pet.eat();
        //pet.slee
          //创建对象
        Pet  pet1=new Pig();
        pet1.eat();

      // Dog  dog= (Dog) new  Pet();
        //要向下转型必须向上转型
        Dog  dog= (Dog) pet;
        //调用子类种独有的方法
        dog.sleep();
          //创建对象
          Pet  pet2=new Pet();
           Pig  pig=new Pig();
        Animal  animal=new Animal();
        animal.m(dog);
        animal.m(pig);


        Pet pet3 = animal.m1();
        if (pet3 instanceof   Pig){
            Pig pig1= (Pig) pet3;
            pig1.eat();
        }

    }
}
