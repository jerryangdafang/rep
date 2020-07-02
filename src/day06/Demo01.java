package day06;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎使用我行我素管理信息系统");
            System.out.println("**************************************");
            System.out.println("\t\t\t1客户信息管理\n\t\t\t2购物结算\n\t\t\t3真情回馈\n\t\t\t4注销");
            System.out.println("********************************");
            System.out.println("请选择：");
            int  n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("客户管理");
                    System.out.println("是否操作客户信息");
                    String s=sc.next();
                    if (s.equals("no")){
                        System.out.println(12345);
                        break;
                    }else {
                        System.out.println("1查询客户信息\n2添加客户信息\n3修改客户信息\n4删除客户信息");
                        int  c=sc.nextInt();
                        switch (c){
                            case 1:
                                break;
                            case 2:
                                System.out.println("请输入会员号：");
                                int   m=sc.nextInt();
                                System.out.println("请输入会员生日：");
                                String    m1=sc.next();
                                System.out.println("请输入会员积分：");
                                double    m2=sc.nextDouble();
                                System.out.println(m+"        "+m1+"           "+m2);
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("输入有误，请重新输入");
                        }
                        break;
                    }
                case 2:
                    System.out.println("请输入是否是会员：");
                    String  s1=sc.next();
                    double   index=1;
                    if (s1.equals("yes")){
                        System.out.println("请输入会员积分（<200的9折，<500的7折）：");
                        double d=sc.nextDouble();
                        if (d>=500){
                            index=0.7;
                        }else if (d>=200){
                            index=0.9;
                        }else {
                            index=0.95;
                        }

                    }else {
                        index=1;
                    }
                    System.out.println("请输入结算金额：");
                    double  m=sc.nextInt();
                    System.out.println("实际支付金额为："+(m*index)+"元");
                 break;
                case 3:
                    System.out.println("幸运抽奖：");
                    System.out.println("请输入会员号：");
                    int   h=sc.nextInt();
                    System.out.println(h+"号客户，谢谢你的支持！");
                    break;
                case 4:
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }


        }



/*


        System.out.println("请输入会员号：");
        int   m=sc.nextInt();
        System.out.println("请输入会员生日：");
        String    m1=sc.next();
        System.out.println("请输入会员积分：");
        double    m2=sc.nextDouble();
        System.out.println(m+"        "+m1+"           "+m2);*/

    }
}
