package day27.day05;
/*

SalesEmployee：Employee的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
BasePlusSalesEmployee：SalesEmployee的子类，有固定底薪的销售人员，工资由底薪加上销售提成部分。属性：底薪。

 */
public class SalesEmployee  extends Employee{
    double  yx;
    double  tc;

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+yx*tc;
    }
}
