import java.util.ArrayList;

public class Card {
    private int number;
    private String symbol;

    public Card(int number, String symbol){
        this.number = number;
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    public int getNumber(){
        return number;
    }

    public String toString(){
        return symbol + " " + number;
    }
}
