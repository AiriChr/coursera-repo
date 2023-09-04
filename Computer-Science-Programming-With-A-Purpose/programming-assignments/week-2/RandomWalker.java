/* *****************************************************************************
 *  Name:              Airish Christian P. Tabay
 *  Coursera User ID:  123456
 *  Last modified:     04/09/2023
 ******************************************************************************/

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]); // take value of 'r' from command line
        int x = 0, y = 0; // variable for the coordinates
        int countSteps = 0;
        System.out.println("(" + x + ", " + y + ")"); // print origin
        while (r != (Math.abs(x) + Math.abs(y))) {
            double direction = Math.random();
            // move south
            if (direction < 0.25) {
                y--;
            }
            // move north
            else if (direction > 0.25 && direction < 0.5) {
                y++;
            }
            // move west
            else if (direction > 0.5 && direction < 0.75) {
                x--;
            }
            // move east
            else if (direction > 0.75) {
                x++;
            }
            System.out.println("(" + x + ", " + y + ")");
            countSteps++;
        }
        System.out.println("steps: " + countSteps);

    }

}

