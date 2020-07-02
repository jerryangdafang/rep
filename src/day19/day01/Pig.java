package day19.day01;
//子类继承父类后，只能继承父类非私有的属性和方法
/*
分类：显示和隐身
    显示：extends能够看见extends关键字的继承是显示继承
    隐式：所有的类都继承java.lang.Object类


 */
public class Pig  extends    Pet{
    @Override
    public void m() {
        System.out.println("-----pig------");
    }
}
