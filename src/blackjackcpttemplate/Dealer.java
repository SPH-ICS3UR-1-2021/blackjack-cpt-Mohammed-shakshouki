
package blackjackcpttemplate;
import java.util.*;
/**
 * Dealer class for ICS3U Quad 2 2021 CPT
 * @author k_zeb
 */
public class Dealer {
    /*
    FIELDS
    */
    
    public ArrayList<Card> hand; //the dealer's hand
    public int handScore;
    /*
    METHODS
    */
    
    public Dealer(){
        //set the hand to an empty arraylist
        //initialize handScore to 0
    }
    
    public void hit(Deck cards){
        //call the deal method on cards
        //Add the returned value to the hand.
        //Call calculateScore        
    }
    
    public void displayHand(){
        //print out the cards in the dealer's hand
    }
    
    public void calculateScore(){
        //add up the score in the hand and print it out
        //save the value in handScore
        
    }
    
    public void dealerTurn(Deck cards){
        //Display the dealer's hand
        //Calculate the score and display it
        //While the handScore<17...
            //call hit
            //display new card and score
    }
}
