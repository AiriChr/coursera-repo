/* *****************************************************************************
 *  Name:              Airish Christian P. Tabay
 *  Coursera User ID:  123456
 *  Last modified:     04/09/2023
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        // take values from command line
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double harmonicNumber = 0;

        // perform iteration to compute for the nth harmonic
        for (int x = 1; x <= n; x++) {
            harmonicNumber += 1 / (Math.pow(x, r));
        }

        // print the value of harmonic number
        System.out.println(harmonicNumber);
    }
}
