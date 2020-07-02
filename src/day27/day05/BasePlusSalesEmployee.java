package day27.day05;
/*

BasePlusSalesEmployee：SalesEmployee的子类，有固定底薪的销售人员，工资由底薪加上销售提成部分。属性：底薪。
 */
public class BasePlusSalesEmployee  extends SalesEmployee{
    double  dx;
    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+dx;
    }
}
