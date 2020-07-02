package day27.day05;
/*
HourlyEmployee：Employee的子类，按小时拿工资的员工，
每月工作超出160小时的部分按照1.5倍工资发放。属性：每小时的工资、每月工作的小时数

 */
public class HourlyEmployee  extends Employee{
       double  h;
       double  m;
    @Override
    public double getSalary(int month) {
        if (h>160){
            return super.getSalary(month)+m*160+(h-160)*1.5*m;
        }else {
            return super.getSalary(month)+h*m;
        }

    }
}
