package day26.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //将时间转字符串
        Date  date=new Date();
      //  SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = df.format(date);
        System.out.println(format);
        //字符串转时间
        String   smg="2020-06-19";
        SimpleDateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = df1.parse(smg);
        System.out.println(parse);


    }
}
