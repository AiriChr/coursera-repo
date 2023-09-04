/* *****************************************************************************
 *  Name:              Airish Christian P. Tabay
 *  Coursera User ID:  123456
 *  Last modified:     03/09/2023
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        // take values from command line
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        // develop grid of n x n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // producing diagonal asterisks
                if (i == j || Math.abs(i - j) <= width) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
