package day30.day01.day02;

import java.io.*;
import java.util.Arrays;

public class DemoFileInputStream {
    public static void main(String[] args) {
       // reader();
        //创建输出流对象
        //writer();
      //  bufReader();
        try {
            FileOutputStream  out=new FileOutputStream("src/day30/day01/stu1.txt",true);
            BufferedOutputStream    bof=new  BufferedOutputStream(out);
            String  msg="waiufui";
            //调用输出流的输出方法
            bof.write(msg.getBytes());
            //关闭资源
            bof.close();
            out.close();
            System.out.println("数据保存成功");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
   //字节缓存输入流
    private static void bufReader() {
        //创建字节输入流对象
        try {
            FileInputStream in=new FileInputStream("src/day30/day01/stu1.txt");
            //字节缓存输入流
            BufferedInputStream bf=new   BufferedInputStream(in);
            //创建数组存储数据
            byte   bs[]=new byte[in.available()];
            //读取数据
            bf.read(bs);
            //将数组转字符串
            String  msg=new String(bs);
            System.out.println(msg);
            //关闭资源
            bf.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //字节输出流
    private static void writer() {
        try {
            FileOutputStream out=new FileOutputStream("src/day30/day01/stu1.txt",true);
            String msg="abnbcdnjewrgnui ";
            byte[] bytes = msg.getBytes();
            out.write(bytes);
            System.out.println("数据保存成功");
            //关闭资源
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节输入流
    private static void reader() {
        try {
            //创建流对象
            FileInputStream in=new FileInputStream("src/day30/day01/stu.txt");
   /*         int read = in.read();
            int read1 = in.read();
            System.out.println((char)read);
            System.out.println((char)read1);*/
        /*    while (true){
                int read = in.read();
                System.out.println(read);
            }*/
            //创建数组来存储读取的数据
            byte   bs[]=new byte[in.available()];
            //开始读取数据
            in.read(bs);
            //将byte转字符串
            String msg=new String(bs);
            System.out.println(msg);
            //关闭资源
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
