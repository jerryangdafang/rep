package day18;

import java.util.Arrays;

public class Meun {
    String   cust[]=new String[6];

    public void    showLoginMeun(){
        System.out.println("------------------------");
        System.out.println("\t\t1登录\n\t\t2退出");
        System.out.println("------------------------");
    }
    public void    showMainMeun(){

        System.out.println("------------------------");
        System.out.println("\t\t1客户信息管理\n\t\t2真情");
        System.out.println("------------------------");
    }
    public void    showCustMeun(){
        System.out.println("------------------");
        System.out.println(Arrays.toString(cust));
        System.out.println("------------------");
    }
    public void    showSendMeun(){

    }
}
