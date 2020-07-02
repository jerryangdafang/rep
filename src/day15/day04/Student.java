package day15.day04;

import java.util.Scanner;

/*
封装(private)：注意一般就是将属性私有化
  当属性私有化以后，那么就需要提供两个方法，使外部可以访问
   setter与getter

    setter：给属性赋值
   格式public  void   set首字母大写的属性名称(属性类型  参数名称){
       this.属性名称=参数名称
    }
    getter：获取属性值
      格式public  属性类型   get首字母大写的属性名称(){
       return 属性名称
    }

    当构造方法被私有化的时候，需要使用其他方法创建对象
     java设计模式23种；
    单列模式：让内存中值存在一个对象
       1懒汉式
       2饿汉式

 */
public class Student {
   // private  static   Student  stu=new Student();
    private  static   Student  stu1=null;
    private   Student(){}

    //饿汉式:无论有没有使用对象都会创建一个对象
/*  public static   Student  getintsace(){
        return   stu;
  }*/
       //懒汉式
    public static   Student  getintsace1(){
        if (stu1==null){
            stu1=   new Student();
        }
        return  stu1;
    }

   private String  name;
   private int  age;
/*
   public  void  setName(String  name){
        this.name=name;
   }
   public   String  getName(){
       return  name;
   }*/
//--------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

