package day26.day01;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
         //创建对象
        Calendar  calendar= Calendar.getInstance();
        System.out.println(calendar);
        //获取年份
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);
        //获取月份
        int i1 = calendar.get(Calendar.MONTH);
        System.out.println(i1+1);
        //获取天
        int i2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i2);
        //获取时
        int i3 = calendar.get(Calendar.HOUR);

        System.out.println(i3);
        //获取时
        int i4 = calendar.get(Calendar.MINUTE);
        System.out.println(i4);
        System.out.println(i+"年"+i1+"月");
    }
}
