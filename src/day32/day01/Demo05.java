package day32.day01;

public class Demo05 {
    public static void main(String[] args) {
        MyThread  myThread=new MyThread();
        myThread.start();
/*        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
        }
    }
}
