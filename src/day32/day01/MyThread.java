package day32.day01;
/*
自定义线程
 */
public class MyThread  extends   Thread{
    //线程执行里面的方法
    @Override
    public void run() {
        //获取当前线程
    /*    Thread thread = Thread.currentThread();
        //获取当前线程的名称
        String name1 = thread.getName();*/
        //获取当前执行的线程名称
        Thread thread =Thread.currentThread();
        for (int i = 0; i <10; i++) {
            try {
                Thread.sleep(800);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName()+":  "+i);

        }
    }


}
