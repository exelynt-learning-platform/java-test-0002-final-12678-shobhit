public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Total rows for the pyramid

        for (int i = 1; i <= n; i++) {
            // 1. Spacing logic: Print 2 spaces for each gap
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // 2. Ascending part: Print numbers from 1 up to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 3. Descending part: Print numbers from i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // 4. Move to next line
            System.out.println();
        }
    }
}
