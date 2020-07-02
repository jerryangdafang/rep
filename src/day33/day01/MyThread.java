package day33.day01;

public class MyThread  extends   Thread {

 @Override
 public void run() {
   for (int i = 0; i <10; i++) {
    try {
     Thread.sleep(1000);
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName()+" : "+i);
   }
 }

 public static void main(String[] args) {
   MyThread  m=new MyThread();
   m.setName("线程一");
   m.start();

  try {
   m.join();
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  for (int i = 0; i <10 ; i++) {
   System.out.println(Thread.currentThread().getName()+" : "+i);
  }
 }
}
