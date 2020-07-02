package day30.day01.day02;

import java.io.*;

public class DemoFilterReader {
    public static void main(String[] args) {
        //reader();
        //writer();
        //buf();
        try {
            BufferedWriter  buw=new BufferedWriter(new FileWriter("src/day30/day01/stu1.txt"));
                  buw.write("你好呀");
                  //刷新
                 buw.flush();
                  buw.close();
            System.out.println("数据保存成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void buf() {
        try {
            BufferedReader bur=new BufferedReader(new FileReader("src/day30/day01/stu1.txt"));
        /*    String s = bur.readLine();
            System.out.println(s);
            String s1 = bur.readLine();
            System.out.println(s1);*/
         /*   int len;
            while ((len=bur.read())!=-1){
                System.out.print((char)len);
            }*/
            bur.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writer() {
        try {
            FileWriter fileWriter=new FileWriter("src/day30/day01/stu1.txt",true);
            fileWriter.write("你好");
            System.out.println("数据报错成功");
            //刷新
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reader() {
        try {
            FileReader fr=new FileReader("src/day30/day01/stu1.txt");
           //创建数组存储数据
            char ch[]=new char[1014];
            //读数据
            fr.read(ch);
            //将数组转字符串
            String msg=new String(ch);
            System.out.println(msg);
            //关闭资源
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
