
public class Array2DTester {
    public static void main(String[] args) {
        Array2DExplorer hesus = new Array2DExplorer();
        int[][] minArray = {{1,6,3,2}, {12,7,16,14}};

//        System.out.println(hesus.minRow(minArray, 1));
//
//
//        for(int n : hesus.colMaxs(minArray)){
//            System.out.println(n);
//        }
//
//        for(int n : hesus.allRowSums(minArray)){
//            System.out.println(n);
//        }

//        for (double w : hesus.averageCol(minArray)){
//            System.out.println(w);
//        }

//        System.out.println(hesus.smallEven(minArray));

//        System.out.println(hesus.biggestRow(minArray));

//        System.out.println(hesus.evenRow(minArray, 1));

        System.out.println(hesus.oddColSum(minArray, 1));
    }
}

