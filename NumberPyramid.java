public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spacing for alignment
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // First half: 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Second half: i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
