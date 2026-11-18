public class Task01_SumAndDifferenceTest {
    public static void main(String[] args) {

        // firstNumber, secondNumber, expectedSum, expectedDifference
        int[][] testCases = {
                {10, 2, 12, 8},
                {4, 24, 28, -20},
                {100, 1, 101, 99}
        };



        for (int[] testCase : testCases) {
            int firstNumber = testCase[0];
            int secondNumber = testCase[1];
            int expectedSum = testCase[2];
            int expectedDifference = testCase[3];

            int actualSum = Task01_SumAndDifference.calculateAdd(firstNumber, secondNumber);

            if (actualSum != expectedSum){
                throw new AssertionError(
                        "Expected: " + expectedSum + ", Actual: " + actualSum
                );
            }

            System.out.println("PASS: " + firstNumber  + " + " + secondNumber );

            int actualDifference = Task01_SumAndDifference.calculateDeduct(firstNumber, secondNumber);
            if (actualDifference != expectedDifference){
                throw new AssertionError(
                        "Expected: " + expectedDifference + ", Actual: " + actualDifference
                );
            }

            System.out.println("PASS: " + firstNumber  + " - " + secondNumber );
        }
    }
}

