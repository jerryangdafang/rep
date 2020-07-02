package day12.day02;

import java.util.Scanner;

public class Administrator {
    String  name;
    String  pwd;
    public  void  show(){
        //循环
        while (true){
            //键盘扫描器
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            //获取字符串
            String  username=scanner.next();
            System.out.println("请输入密码：");
            //获取字符串
            String  password=scanner.next();
            //判断   &&并且的以上
            if (name.equals(username)&&pwd.equals(password)){
                System.out.println("请输入新密码");
                //二次赋值
                pwd=scanner.next();
                System.out.println("修改成功，你的用户名为："+name+" 密码为:"+pwd);
                System.exit(0);//退出程序
            }else {
                System.out.println("用户名或者密码错误，请重新输入。。。。");
            }
        }

    }
}
