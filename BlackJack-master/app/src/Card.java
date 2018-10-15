package lanicholas.loyola.edu.blackjack;

import android.widget.ImageView;

/** 
 * A class representing a card
 *
 *  @author Lillian Nicholas
 *  @version 1.0 10/6/18 // Don't need the ()
 *  @since version 0.0 // @since should be 1.0 in this case. It stands for in which release was this class added
 */
public class Card {

    /** The point value associated with the card */
    private int points;

    /** The suit of the card */
    private String suit;

    /** The face value / rank of the card */
    private String value;

    /** 
     * Create a new Card object
     * @param suit the suit of the card
     * @param value the face value of the card
     * @param points the point value associated with the card
     */
    public Card(String suit, String value, int points){
        this.suit = suit;
        this.value = value;
        this.points = points;
    }

    /** Gets the point value of a card
     * @return the number of points asscoiated with that card
     */
    public int getPoints( ){
        return points;
    }

    /** 
     * Sets the point value of a card
     * @param p the new point value of the card
     * -- Try avoiding this setter method as you have the constructor to set the value
     * -- You probably don't 
     */
    public void setPoints(int p){
        points = p;
    }

    /** Gets the suit of the card
     * @return the suit of the card
     */
    public String getSuit( ){
        return suit;
    }

    /** Gets the face value of the card
     * @return the face value of the card spelled out
     */
    public String getValue( ){
        return value;
    }
}
