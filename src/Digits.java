import java.util.ArrayList;
//I have neither given nor received unauthorized aid on this piece of work.
public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) throws IllegalArgumentException{
        if (num<0){
            throw new IllegalArgumentException("The number passed to the constructor ("+num+") cannot be negative!");
        }
        String number = num + "";
        this.digitList = new ArrayList<Integer>(number.length());
        for (int i =0; i < number.length(); i++){
            this.digitList.add(Integer.valueOf(number.charAt(i))-48);
        }
    }


    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size()-1; i++){
           if (digitList.get(i)>= digitList.get(i+1)) {
               return false;
           }
        }
        return true;
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }
}
