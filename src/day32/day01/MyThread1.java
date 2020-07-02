package day32.day01;
/*
自定义线程 ：2  这个类只是一个可执行类
 */
public class MyThread1 implements Runnable {
    @Override
    public void run() {
        //获取线程名称
        Thread thread = Thread.currentThread();
        for (int i = 0; i <10 ; i++) {
            if (thread.getName().equals("线程一")){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
               // Thread.yield();
       /*     if (thread.getName().equals("线程一")){
                System.out.println("测试。。。");
                thread.interrupt();
            }*/
            System.out.println(thread.getName()+" --- "+i);
        }
    }
}
