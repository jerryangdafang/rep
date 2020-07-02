package day22.day01;

public class Student {

    public   int age;


    public   int getAge() throws DemoException {
        if (age<1){
            throw new DemoException("年龄不能小于1");
        }
        return  age;
    }







    public  void  m() throws ClassNotFoundException {


        Class.forName("");

    }
}
