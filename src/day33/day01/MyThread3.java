package day33.day01;
/*
synchronized:
  方法锁：只能有一个线程进入方法


 */
public class MyThread3  implements   Runnable{
 private    int  metera=1000;
 @Override
 public void run() {

       pao();

 }

 private  synchronized   void pao() {
 // synchronized (this) {
  while (true){
   System.out.println("-------------------------"+Thread.currentThread().getName());

        if (metera < 100) {
         break;
        }
        System.out.println(Thread.currentThread().getName() + "拿到接力棒");
        for (int i = 0; i < 100; i += 10) {
         try {
          Thread.sleep(1000);
         } catch (InterruptedException e) {
          e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName() + "跑了" + (i + 10) + "米");
        }
        metera -= 100;
        break;
       }
  // }

 }

 public static void main(String[] args) {
     MyThread3  myThread3=new MyThread3();
  for (int i = 0; i <10; i++) {
   new Thread(myThread3,(i+1)+"号选手").start();
  /* System.out.println("-------------------"+(i+1));*/


  }
 }
}
