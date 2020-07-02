package day19.day02.work4;

public class Test {
    public static void main(String[] args) {
        Card  card=new Card();
        card.setCard(123,123123);

        SoldCard  soldCard=new SoldCard();
        if (card.getCard(123,123123)){
            soldCard.getPrice();
        }
        card.show();
    }
}
