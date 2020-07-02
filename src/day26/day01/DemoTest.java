package day26.day01;

public class DemoTest {
    public static void main(String[] args) {
        String   user="admin123";
        //定义两个变量，用来判断是否包含字母，和数字
        boolean  isDigit=false;//false/true
        //判断字母
        boolean  isLette=false;
        //字符串转数组
        char[] chars = user.toCharArray();
        System.out.println(chars.length);
        //遍历数组
        for (int i = 0; i <8 ; i++) {
            //判断是否是数字
            if (Character.isDigit(chars[i])){
                isDigit=true;

            }
            //判断是否是字母
            if (Character.isLetter(chars[i])){
                isLette=true;

            }
        }
        //判断是否包含字母和数字
        if (isDigit&&isLette){
            System.out.println(user+"是包含字母和数字的：");
        }
    }
}
