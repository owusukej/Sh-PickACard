
package ca.sheridancollege.softwarefundamentals.pickacard;
import java.util.Scanner;


public class CardTrick {
    
    
    
    public static void main(String[] args)
    {
                Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        
        System.out.println("Pick a card, any card");
        System.out.println("Pick the card value");

      String UserValue = input.nextLine();
        System.out.println("Pick the card suit");

        String UserSuit = input.nextLine();
        
        System.out.println("Your card is: " + UserValue + " of " + UserSuit);
                System.out.println("Let's see if your card is in the magic hand");

            
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             
c.setValue(c.randomValue());
c.setSuit(Card.SUITS[c.randomSuit()]);
magicHand[i] =c;
}
        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getSuit() + " " + magicHand1.getValue());
        }

        }
        
      
        
    }
    

