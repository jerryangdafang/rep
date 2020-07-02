package day32.day01;

public class Demo03 {
    public static void main(String[] args) {
        //创建线程可执行类对象
        MyThread1  myThread1=new MyThread1();
      //  myThread1.start();
       /* Thread  thread=new Thread(myThread1,"线程一：");
        thread.start();*/
       Thread  thread=new Thread(myThread1);
        thread.setName("线程一：");
        thread.start();
        Thread  thread1=new Thread(myThread1);
        thread1.setName("线程二：");
        thread1.start();

    }
}
