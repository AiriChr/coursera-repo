/* *****************************************************************************
 *  Name:              Airish Christian P. Tabay
 *  Coursera User ID:  123456
 *  Last modified:     03/09/2023
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        // input values for x1, y1, x2, and y2 respectively
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        // radius of earth
        double r = 6371.0;

        // finding distance using Haversine Formula
        double firstTerm = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2);
        double secondTerm = Math.cos(x1) * Math.cos(x2) * Math.sin((y2 - y1) / 2) * Math.sin(
                (y2 - y1) / 2);
        double distance = 2 * r * Math.asin(Math.sqrt(firstTerm + secondTerm)); // distance

        // output the computed distance
        System.out.println(distance + " kilometers");

    }
}
