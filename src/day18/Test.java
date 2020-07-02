package day18;


import com.sun.jndi.dns.DnsClient;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
          Meun  meun=new Meun();
          while (true){
              meun.showLoginMeun();
              System.out.println("请选择:");
              int i = scanner.nextInt();
              switch (i){
                  case 1:
                       while (true){
                           meun.showMainMeun();
                           System.out.println("请选择:");
                           int i1 = scanner.nextInt();
                           switch (i1){
                               case 1:
                                 meun.showCustMeun();
                                   System.out.println("1添加客户\n2删除客户\n3修改客户\n4查询单个客户");
                                   System.out.println("请选择：");
                                   int   n=scanner.nextInt();
                                   switch (n){
                                       case  1:
                                           System.out.println("请输入客户名称：");
                                           String  name=scanner.next();
                                           for (int j = 0; j < meun.cust.length; j++) {
                                               if (meun.cust[j]==null){
                                                   meun.cust[j]=name;
                                                   break;
                                               }

                                           }
                                           meun.showCustMeun();
                                           break;
                                       case  2:
                                           System.out.println("请输入要删除的客户信息：");
                                           String   string=scanner.next();
                                           for (int j = 0; j < meun.cust.length; j++) {
                                                 if (meun.cust[j].equals(string)){
                                                    meun.cust[j]=null;
                                                     break;
                                                 }

                                           }
                                           meun.showCustMeun();
                                           break;
                                       case  3:
                                           System.out.println("请输入要修改的客户信息：");
                                           String   string1=scanner.next();
                                           for (int j = 0; j < meun.cust.length; j++) {
                                               if (meun.cust[j].equals(string1)){
                                                   System.out.println("请输出修改内容");
                                                   meun.cust[j]=scanner.next();
                                                   break;

                                               }

                                           }
                                           meun.showCustMeun();

                                           break;
                                       case  4:
                                           System.out.println("请输入要查询的客户信息：");
                                           String   string2=scanner.next();
                                           for (int j = 0; j < meun.cust.length; j++) {
                                               if (meun.cust[j].equals(string2)){
                                                   System.out.println("你查询的客户信息是："+string2);
                                                   meun.cust[j]=scanner.next();
                                                   break;

                                               }

                                           }
                                           break;
                                       default: break;
                                   }


                                   break;
                               case 2:break;
                               default:
                                   System.out.println("你输入有误,请重新输入。。。。。");
                                   break;


                           }
                       }
                  case 2:
                      System.out.println("谢谢回顾");
                      System.exit(0);
                      break;
                  default:
                      System.out.println("你输入有误，请重新输入。。。");
                      break;
              }
          }


    }
}
