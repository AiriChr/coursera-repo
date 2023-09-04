/* *****************************************************************************
 *  Name:              Airish Christian P. Tabay
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]); // steps
        int trials = Integer.parseInt(args[1]); // trials
        int countSteps = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0;

            while (Math.abs(x) + Math.abs(y) != r) {
                double move = Math.random();

                if (move < 0.25) {
                    y++;
                }
                else if (move > 0.25 && move < 0.5) {
                    x++;
                }
                else if (move > 0.5 && move < 0.75) {
                    y--;
                }
                else if (move > 0.75) {
                    x--;
                }
                else break;
                countSteps++;
            }

        }
        double average = (double) countSteps / trials;
        System.out.println("average number of steps = " + average);
    }
}
