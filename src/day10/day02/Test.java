package day10.day02;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Card  card=new Card();
        //调用方法
        card.show();

        //给属性赋值
        card.type="法拉利";
        card.number=8;
        card.money=600;

        //方法的使用
        card.show();
       //创建对象
        Card  card1=new Card();
        //调用方法
        card1.show();


    }
}
