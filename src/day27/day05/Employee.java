package day27.day05;
/*
Employee：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。方法：getSalary(int month)
 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100元。

 */
public class Employee {
   String name;
    int   brh;
    public double getSalary(int month){
        if (month==brh){
            return 100;
        }
        return 0;
    }
}
