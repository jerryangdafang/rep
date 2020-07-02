package day08;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        String  name[]={"admin","jack","jerry"};
        String  pwd[]={"1234567","123123","000000"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <3; i++) {
            System.out.println("请输入用户名：");
            String  user=sc.next();
            System.out.println("请输入密码：");
            String  password=sc.next();
            if (user.equals(name[i])&&password.equals(pwd[i])){
                System.out.println("--------------");
                System.exit(0);
            }else {
                System.out.println("输入错误，你还有"+(2-i)+"次机会");
            }
        }
    }
}
