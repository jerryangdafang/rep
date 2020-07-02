package day27.day05;
/*

SalariedEmployee：Employee的子类，拿固定工资的员工。属性：月薪
*/
public class SalariedEmployee  extends Employee{
    double  yx;

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+yx;
    }
}
