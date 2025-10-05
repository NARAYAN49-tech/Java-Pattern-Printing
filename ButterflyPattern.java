public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 5;
        /* Printing first 5 rows */
        for (int i = 1; i <= rows; i++) {
            /* printing first part */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            /* Printing spaces */
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            /* Printing second part  */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            /* Stepping to next line */
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

