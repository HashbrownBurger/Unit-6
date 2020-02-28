public class Array2DExplorer {
    Array2DExplorer() {
    }

    public int minRow(int[][] nums, int row) {
        int min = nums[row][0];
        for (int i = 0; i < nums[row].length; i++) {
            if (nums[row][i] < min)
                min = nums[row][i];
        }
        return min;
    }

    public int[] colMaxs(int[][] matrix) {
        int[] returnMatrix = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            returnMatrix[i] = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (returnMatrix[i] > matrix[i][j]) {
                    returnMatrix[i] = matrix[i][j];
                }
            }
        }
        return returnMatrix;
    }

    public int[] allRowSums(int[][] data) {
        int[] returnMatrix = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < data[i].length; j++) {
                rowSum += data[i][j];
                returnMatrix[i] = rowSum;
            }
        }
        return returnMatrix;
    }

    public double[] averageCol(int[][] nums) {
        double[] returnMatrix = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            double rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }

            double rowLength = nums[i].length;
            double rowAverage = rowSum / rowLength;
            returnMatrix[i] = rowAverage;
        }

        return returnMatrix;
    }

    public int smallEven(int[][] matrix) {
        int compareValue = 2147483647;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] < compareValue) {
                    compareValue = matrix[i][j];
                }
            }
        }
        return compareValue;
    }

    public static int biggestRow(int[][] nums) {
        int firstCompare = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
                if (firstCompare < rowSum)
                    firstCompare = rowSum;
            }
        }
        return firstCompare;
    }

    public boolean evenRow(int[][] mat, int row) {
        boolean isEven = true;
        for (int i = 0; i < mat[row].length; i++) {
            if (mat[row][i] % 2 != 0)
                isEven = false;
        }
        return isEven;
    }

    public boolean oddColSum(int[][] nums, int col) {
        boolean isOdd = true;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i][col];
        }
        if (sum % 2 == 0)
            isOdd = false;
        return isOdd;
    }
}



