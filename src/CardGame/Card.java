package CardGame;

/**
 * Name:
 * Date:
 * Period:
 *
 * CardGame.Card.java
 *
 * Represents a Card with a face and a suit.
 */

public class Card
{
    private String face;
    private String suit;

    public Card (String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;
    }

    public String toString()
    {
        return face + " of " + suit;    
    }

    public String getFace() {
        return face;
    }
    
    public String getSuit() {
        return suit;
    }
}
