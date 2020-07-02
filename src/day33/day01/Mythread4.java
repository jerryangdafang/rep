package day33.day01;

public class Mythread4 implements   Runnable {
 private   int  count=10;
 private   int  num=0;
 private   boolean  flag=false;



 @Override
 public void run() {
    while (true){
     if (!sale()){
      break;
     }
    }
 }

 private synchronized   boolean sale() {
  if (count<=0){
   return   false;
  }

  num++;
  count--;

   System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票  剩余"+count+"张票");
    if (Thread.currentThread().getName().equals("黄牛党")){
     return  false;
    }
  return   true;
 }

 public static void main(String[] args) {
     Mythread4  mythread4=new Mythread4();
     Thread  th=new Thread(mythread4,"陶跑跑");
     th.start();
     Thread  th1=new Thread(mythread4,"张票票");
     th1.start();
  Thread  th2=new Thread(mythread4,"黄牛党");
  th2.start();
 }
}
