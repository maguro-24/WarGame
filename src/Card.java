

public class Card {
    
    private int face;
    private int suit;
    
    public Card(){
        face = (int)(Math.random()*13+1);
        suit = (int)(Math.random()*13+1);
    }
    
    public Card(int f , int s){
        face = f;
        suit = s;
    }
    
    public int getFace(){
        return face;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public String toString(){
        String result = "";
        if (face == 1){
            result += "Ace";
        }
        else if (face == 11){
            result += "Jack";
        }
        else if (face == 12){
            result += "Queen";
        }
        else if (face == 13){
            result += "King";
        }
        else{
            result += face;
        }
        
        result += " of ";
        
        if(suit == 1){
            result += "Hearts";
        }
        else if(suit == 2){
            result += "Spades";
        }
        else if(suit == 3){
            result += "Diamonds";       
        }
        else 
            result += "Clubs";
        
        return result;          
    }
    

}
