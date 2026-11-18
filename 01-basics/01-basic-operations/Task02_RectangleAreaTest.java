public class Task02_RectangleAreaTest {

    public static void main(String[] args) {

        // length, width, expected
        int[][] testCases = {
                {2, 2, 4},
                {6, 4, 24},
                {0, 5, 0},
                {1, 10, 10}
        };

        for (int[] testCase : testCases) {
            int length = testCase[0];
            int width = testCase[1];
            int expected = testCase[2];

            int actual = Task02_RectangleArea.calculateArea(length, width);

            if (actual != expected) {
                throw new AssertionError(
                        "Expected: " + expected + ", Actual: " + actual
                );
            }

            System.out.println("PASS: " + length + " x " + width);
        }
    }
}