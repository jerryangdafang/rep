package day19.day02.work3;

public class Test {
    public static void main(String[] args) {
        SmallDog smallDog=new SmallDog();
        smallDog.dogWalk();
        smallDog.setDogAge(40);
        smallDog.setDogName("王五");
        System.out.println(smallDog.dogAge);
        System.out.println(smallDog.dogName);
    }
}
