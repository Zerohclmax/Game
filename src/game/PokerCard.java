package game;

import java.util.*;

public class PokerCard {
    private List<Card> cards = new ArrayList<Card>();

    public PokerCard() {
        int[] mark = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] flo_color = new String[]{"❤", "💚", "🟧", "🎆"};
        for (String i : flo_color) {
            for (int j : mark) {
                Card card = new Card(j, i);
                cards.add(card);
            }
        }
    }

    public void disorders() {
        Collections.shuffle(cards);
    }

    public Card givecard() {
        Card list = cards.get(0);
        cards.remove(0);
        return list;
    }

//    public List<Card> getCards() {
//        return cards;
//    }
//
//    public Card getCard(int i) {
//        return cards.get(i);
//    }
}

class Card implements Comparable<Card> {
    public int mark;
    public String flo_color;

    public Card(int mark, String flo_color) {
        this.mark = mark;
        this.flo_color = flo_color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "mark='" + mark + '\'' +
                ", flo_color='" + flo_color + '\'' +
                '}';
    }

//    public int compareTo(Card o) {
//        return this.mark.compareTo(o.mark);
//    }
    public int compareTo(Card o){//比价和equals和hashcode在T类中写！！！！
        return o.mark-this.mark;//0是相等；o大返回负数；o小返回正数!!!
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(mark, card.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
    }
}


class Person {
    private List<Card> cards;
    public int id;

    public Person(int id) {
        this.cards = new ArrayList<Card>();
        this.id = id;
    }

    public void setCards(Card card) {
        cards.add(card);
    }

    public void list() {
        for (Card i : cards) {
            System.out.println(i);
        }
    }
    public void Sort(){
        Collections.sort(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}
