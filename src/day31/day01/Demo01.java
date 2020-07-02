package day31.day01;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) {
        //out();
       // in();
    }
     //输出入的方法
    private static void in() {
        try {
            //创建输入流对象
            DataInputStream dis=new DataInputStream(new FileInputStream("src/day31/day01/stu.txt"));
              //调用输入流方法
            String s = dis.readUTF();
            System.out.println(s);
            //关闭资源
            dis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void out() {
        try {
            //创建对象流方法
            DataOutputStream dos=new DataOutputStream(new FileOutputStream("src/day31/day01/stu.txt"));
            //调用节点流输出的方法
             dos.writeUTF("你好,这里是对象流");
             //刷新
             dos.flush();
             //资源
             dos.close();
            System.out.println("数据保存成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
