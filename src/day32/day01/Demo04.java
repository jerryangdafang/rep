package day32.day01;

public class Demo04 {
    public static void main(String[] args) {
        int i = Thread.activeCount();
        System.out.println(i);
        MyThread1   myThread1=new MyThread1();
        Thread  thread=new Thread(myThread1);
        thread.setName("线程一");
        thread.setPriority(1);
        thread.start();
        Thread  thread1=new Thread(myThread1);
        thread1.setName("线程二");
        thread1.setPriority(10);
        thread1.start();
        System.out.println(thread.getPriority());
        System.out.println(thread1.getPriority());
    }
}
