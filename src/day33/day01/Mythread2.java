package day33.day01;

public class  Mythread2 implements  Runnable {
 @Override
 public void run() {
  for (int i = 0; i <10 ; i++) {
        System.out.println("特殊号："+(1+i)+"号在看病");
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
 }

 public static void main(String[] args) {
    //创建可执行类对象
     Mythread2 mythread2=new Mythread2();
     //Thread(Runnable target)
      //          分配新的 Thread 对象。
     Thread  thread=new Thread(mythread2);
     //线程的启动
     thread.start();
  for (int i = 1; i <=50 ; i++) {
   System.out.println("普通号："+i+"号在看病");
   try {
    //休眠时间
    Thread.sleep(500);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }

   if (i==10){
    try {
     //等待
     thread.join();
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
   }
  }
 }
}
