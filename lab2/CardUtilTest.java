package lab2;

public class CardUtilTest {
    public static void main(String[] args) {
        Card c1 = new Card(Rank.ACE, Suite.SPADES);
        Card c2 = new Card(Rank.KING, Suite.SPADES);
        Card c3 = new Card(Rank.ACE, Suite.HEARTS);

        System.out.println(CardUtil.isHighestCard(c1));
        System.out.println(CardUtil.isHighestCard(c2));
        System.out.println(CardUtil.isHighestCard(c3));
    }
}