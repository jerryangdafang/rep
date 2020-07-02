package day26.day01;

public class TestCharacter {
    public static void main(String[] args) {
        // 确定指定字符是否为数字。
        boolean c = Character.isDigit('c');
        System.out.println(c);
        // 确定指定字符是否为字母。
        boolean c1 = Character.isLetter('c');
        System.out.println(c1);
        String   user="admin1234";
        boolean  isDigit=false;
        boolean  isLetter=false;
         //字符串抓数组
        char[] chars = user.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
              if (Character.isDigit(chars[i])){
                  System.out.println("包含数字");
              }
        }
    }
}
