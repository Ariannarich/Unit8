public class TwoDArrays {

    public static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] > max)
                    max = arr[row][col];
            }

        } return max;
    }

    public static int sumAll(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                sum += arr[row][col];
            }

        }
        return sum;
    }

    public static boolean isSquare(int[][] arr) {
        boolean isSquare = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (row == col)
                    isSquare = true;
            }

        }
        return isSquare;
    }
}































