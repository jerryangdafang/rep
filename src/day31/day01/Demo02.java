package day31.day01;

import java.io.*;

public class Demo02 {

    public static void main(String[] args) {
        oos();
       // ois();


    }

    private static void ois() {
        try {
            //创建对象流输入对象
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/day31/day01/stu.txt"));
          //调用对象流输入的方法
            Student object = (Student) ois.readObject();
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void oos() {
        //创建对象   需要保存的类必须是实现java.io.Serializable 序列化接口
        Student stu=new Student();
        //给属性赋值
        stu.setId(10002);
        stu.setName("李林奥");
        stu.setSex("女");
        try {
            //创建对象输出流对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/day31/day01/stu.txt",true));

            //调用对象流方法
            oos.writeObject(stu);
            //刷新
            oos.flush();
            //关闭资源
            oos.close();
            System.out.println("保存成功：");

        } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
