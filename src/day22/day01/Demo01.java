package day22.day01;
/*
异常：程序在编写或者运行的时候发生的错误
    分类：
       1编译的时候
            容易控制
       2运行的时候
          很难控制的，
       try{
         有肯出现异常的代码
       }catch(需要抛出的异常类){
          抛出异常
       }
       1一个try对应一个catch,一个try可以有多个catch
 */
public class Demo01 {
    public static void main(String[] args) {
Student  student=new Student();
        try {
            student.m();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        /* int   a=3;
         int  b=0;
         try {
             int n=a/b;
             System.out.println(n);
              Class.forName("");
         }catch (ArithmeticException e){
            e.getStackTrace();
         }catch (ClassNotFoundException e){
             System.out.println("--------------");
         }*/


    }
}
