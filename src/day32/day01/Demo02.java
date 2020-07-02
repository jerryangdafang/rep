package day32.day01;

public class Demo02 {
    public static void main(String[] args) {
        //创建自定义的线程
        MyThread   myThread=new MyThread();
        //给线程取名
        myThread.setName("线程一：");
        //myThread.run();//普通方法的调用
        myThread.start();//线程的启动
      // myThread.start();//线程不能重复启动
        System.out.println("-------------------");
        MyThread   myThread1=new MyThread();
        //给线程取名
        myThread1.setName("线程二：");
        //myThread.run();//普通方法的调用
        myThread1.start();//线程的启动

    }
}
