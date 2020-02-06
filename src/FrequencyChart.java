import java.util.Scanner;

public class FrequencyChart {
    private int[] arry;
   private String first = "", second = "", third = "", fourth = "", fifth = "", sixth = "", seventh ="", eighth = "", ninth = "", tenth = "";
    public FrequencyChart(int[] list){
        this.arry = list;
    }

    public String makeChart(){
    for(int i = 0; i < arry.length; i++){
        if( arry[i]>= 1 && arry[i]<= 10) {
            first += "*";
        }

        else if( arry[i]>= 11 && arry[i]<= 20) {
            second += "*";
        }

        else if( arry[i]>= 21 && arry[i]<= 30) {
            third += "*";
        }

        else if( arry[i]>= 31 && arry[i]<= 40) {
            fourth += "*";
        }

        else if( arry[i]>= 41 && arry[i]<= 50) {
            fifth += "*";
        }

        else if( arry[i]>= 51 && arry[i]<= 60) {
            sixth += "*";
        }

        else if( arry[i]>= 61 && arry[i]<= 70) {
            seventh += "*";
        }

        else if( arry[i]>= 71 && arry[i]<= 80) {
            eighth += "*";
        }

        else if( arry[i]>= 81 && arry[i]<= 90) {
            ninth += "*";
        }

        else if( arry[i]>= 91 && arry[i]<= 100) {
            tenth += "*";
        }
        }

    return ("1 - 10 | " + first + "\n11 - 20| " + second + "\n21 - 30| " + third + "\n31 - 40| " + fourth + "\n41 - 50| " + fifth
            + "\n51 - 60| " + sixth + "\n61 - 70| " + seventh + "\n71 - 80| " + eighth + "\n81 - 90| " + ninth + "\n91 - 100| " + tenth);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data values one at a time, followed by enter.");
        int val;
        for (int i = 0; i < data.length; i++) {
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);
        System.out.println(chart.makeChart());
    }

}
