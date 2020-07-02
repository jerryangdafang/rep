package day33.day01;

public class Demo01 {
 public static void main(String[] args) {
    Thread  t1=new Thread(new Runnable() {
     @Override
     public void run() {
      for (int i = 0; i <10 ; i++) {
       try {
        Thread.sleep(600);
        System.out.println(Thread.currentThread().getName()+":" +i);
       } catch (InterruptedException e) {
        e.printStackTrace();
       }
      }
     }
    },"线程一");
    t1.start();
  Thread  t2=new Thread(new Runnable() {
   @Override
   public void run() {
    try {
     t1.join();
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
    for (int i = 0; i <10 ; i++) {
     try {
      Thread.sleep(600);
      System.out.println(Thread.currentThread().getName()+":" +i);
     } catch (Exception e) {
      e.printStackTrace();
     }
    }
   }
  },"线程二");
  t2.start();
  Thread  t3=new Thread(new Runnable() {
   @Override
   public void run() {
    try {
     t2.join();
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
    for (int i = 0; i <10 ; i++) {
     try {
      Thread.sleep(600);
      System.out.println(Thread.currentThread().getName()+":" +i);
     } catch (InterruptedException e) {
      e.printStackTrace();
     }
    }
   }
  },"线程三");
  t3.start();
 }
}
