import java.util.ArrayList;

class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double returnNumber = 0;
        for (int i = 0; i < coins.size(); i++) {
            returnNumber += coins.get(i).getValue();
        }
        return returnNumber;
    }


        // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
        public int count(Coin aCoin){
            int matchNumber = 0;
            for (int i = 0; i < coins.size(); i++) {
                if (coins.get(i).getValue() == aCoin.getValue() && coins.get(i).getName().equals(aCoin.getName())) {
                    matchNumber++;
                }
            }
            return matchNumber;
        }

        public String findSmallest(){
        Coin compare = coins.get(0);
            for (int i = 0; i < coins.size(); i++) {
                if(compare.getValue() > coins.get(i).getValue()){
                    compare = coins.get(i);
                }
            }
            return compare.getName();
// returns the name of the Coin in the Purse that has the smallest value


    }
}