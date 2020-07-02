package day27.day02;

public class Test {
    public static void main(String[] args) {
        Food food=new Food();
        food.foodName="馒头";
        Animal  animal=new Animal();
        animal.food=food;
        animal.animalName="阿黄";
        AnimalKp  ak=new AnimalKp();
        ak.weak(animal);
    }
}
