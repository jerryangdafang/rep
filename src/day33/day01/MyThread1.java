package day33.day01;

public class MyThread1 extends   Thread {
 //设置时间的参数
 private   int  time;
 //设置爬的路
 private   int num;

 public  MyThread1(String  name,int time ,int kilnum){
     super(name);
      this.time=time;
      this.num=kilnum*1000/100;

 }

 @Override
 public void run() {
      while (num>0){
       try {
        Thread.sleep(time);
       } catch (InterruptedException e) {
        e.printStackTrace();
       }
       System.out.println(Thread.currentThread().getName()+"又爬了100米");
       num--;
      }
  System.out.println(Thread.currentThread().getName()+"到达终点");
 }

 public static void main(String[] args) {
  MyThread1 m=new MyThread1("张宏臣",500,1);
  m.start();
  MyThread1 m1=new MyThread1("李四",800,1);
  m1.start();
 }
}
