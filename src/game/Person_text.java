package game;

import java.util.Collections;

public class Person_text {
    public static void main(String[] args) {
        PokerCard pokerCard = new PokerCard();
        Person person1 = new Person(1);
        Person person2= new Person(2);
        System.out.println("--------------开始游戏------------");
        pokerCard.disorders();
        person1.setCards(pokerCard.givecard());
        person1.setCards(pokerCard.givecard());
        person2.setCards(pokerCard.givecard());
        person2.setCards(pokerCard.givecard());
        person1.list();
        person2.list();
        person1.Sort();
        Card c1= person1.getCards().get(0);
        person2.Sort();
        Card c2 = person2.getCards().get(0);
        System.out.println("-------------结算-----------");
        System.out.println("c1:"+person1.getCards());
        System.out.println("c2:"+c2);
        if (Integer.valueOf(c1.mark)>Integer.valueOf(c2.mark)){
            System.out.println("1 is win");
        }else {
            System.out.println("2 is win");
        }

    }
}
