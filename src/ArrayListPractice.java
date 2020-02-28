import java.util.ArrayList;

public class ArrayListPractice {
    public ArrayListPractice() {
    }

    public static void removeZeros(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public int countLetters(ArrayList<String> list) {
        int charecterNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            String number = list.get(i);
            charecterNumber += number.length();
        }
        return charecterNumber;
    }

    public int findPosition(int keyValue, ArrayList<Integer> list){
        int returnValue = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == keyValue){
                returnValue = i;
            }
        }
        return returnValue;
    }

    public ArrayList<String> parseIntoArrayList(String input){
           ArrayList<String> returnArray = new ArrayList<String>();
        for (int i = 0; i < input.length()-1; i++) {
            String letter = input.substring(i, i+1);
            returnArray.add(i, letter);
        }
        return returnArray;
    }

    public String findMin(ArrayList<Person> list){
       int compareAge = list.get(0).getAge();
       int spot = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() < compareAge){
                compareAge = list.get(i).getAge();
                spot = i;
            }
        }
        return list.get(spot).getName();
    }
}





