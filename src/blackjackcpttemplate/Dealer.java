
package blackjackcpttemplate;
import java.util.*;
/**
 * Dealer class for ICS3U Quad 2 2021 CPT
 * @author Mohammed Shakshouki
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
        this.hand=new ArrayList<Card>();
        this.handScore=0;
    }
    
    public void hit(Deck cards){
        //call the deal method on cards
        //Add the returned value to the hand.
        //Call calculateScore
               Card newCard=cards.deal();
          hand.add(newCard);   
          //system.out.println("New card: "+newCard.getName());
          this.calculateScore();

           
    
    public void displayHand(){
        //print out the cards in the dealer's hand
        String msg = "Dealer's Top Card(s) :";
        for(int i=l;i<hand.size();i++)(
            msg+=" "+hand.get(i).getName();
            if(i<hand.size()-l)(
                 msg+=",";
            )    
    }
     System.out.println(msg);
    
    
  
  public void calculateScore(){
        //add up the score in the hand and print it out
        //save the value in handScore
     this.handScore=0;
           int aces=0;
          fort(int i=0;i<hand.size();i++)(
               if(hand.get(i).getValue()==l)   
                   aces++;

          )    
          else(
    }         handScore+=hand.get(1).getValue();
          )
    }
    //system.out.println(handScore);

}      



    
    public void dealerTurn(Deck cards){
        //Display the dealer's hand
        //Calculate the score and display it
        //While the handScore<17...
            //call hit
            //display new card and score
            displayHand();
            calculateScore();
             System.out.println("Dealer's Score: "+handScore);
            while(handScore<17)(
                hit(cards);
                System.out.println("New card: "+hand.get(hand.size()-1).getName());
                System.out.println("Dealer's Score: "+handScore);
    }
}
