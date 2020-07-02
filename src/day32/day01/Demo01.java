package day32.day01;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Demo01 {
    public static void main(String[] args) {
        //获取当前执行的线程名称
        String name = Thread.currentThread().getName();
        System.out.println(name);
        //获取线程最高优先级：优先执行
        System.out.println(Thread.MAX_PRIORITY);
        //线程可以具有的最低优先级。
        System.out.println(Thread.MIN_PRIORITY);
        //分配给线程的默认优先级
        System.out.println(Thread.NORM_PRIORITY);//所有的线程的优先级都是5
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //创建自定义的线程
        MyThread   myThread=new MyThread();
        //给线程取名
        myThread.setName("线程一：");
        //myThread.run();//普通方法的调用
        myThread.start();


    }
}
