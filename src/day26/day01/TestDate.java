package day26.day01;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date   date=new Date();
        System.out.println(date);
        date.setYear(2020);
        int year = date.getYear();
        System.out.println(year);
        int month = date.getMonth();
        System.out.println(month+1);
        //  2020-06-19


    }
}
