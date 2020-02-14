public class Array2DExplorer {
    Array2DExplorer(){}

    public int minRow(int[][] nums, int row){
        int min = nums[row][0];
        for(int i = 0; i < nums[row].length; i++){
            if(nums[row][i] < min)
                min = nums[row][i];
        }
        return min;
    }

    public int[] colMaxs(int[][]matrix){
        int returnMatrixLength = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
            }
        }
    }

}
