package blackjackcpttemplate;
import java.util.*;
/**
 * The player class for ICS3U Quad 2 2021 CPT
 * @author k_zeb
 */
public class Player {
    /*
    FIELDS
    */
    public ArrayList<Card> hand; //hand of cards.
    public int handScore;
    public int bank; //the total score of the player
    
    /*
    METHODS
    */
    
    /**
     * Constructor for Player
     */
    public Player(){
        //Create an empty array list for hand
        //Initialize handScore to 0
        //Initialize bank to a setting (probably 1000)
        bank=1000;
    }
    
    
    public void hit(Deck cards){
        //Call the deal method on cards
        //Add the returned value to your hand.
        //Call calculateScore()
    }
    
    public void calculateScore(){
        //add up the values of all the cards in hand
        //save the value in handScore and print out the value
    }
    
    public void displayHand(){
        //print out the values of the cards in the hand. Loops are helpful here!
    }
    
    public void playerTurn(Deck cards){
        //print out player's hand
        //calculate the total of the hand
        //while the total <21 and they have not said STAY...
            //ask HIT or STAY
            //If HIT,
                //call hit(cards)
                //if new total>21, print BUST
            //else if STAY
                //break out of loop
        
    }
    
}
