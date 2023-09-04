/* *****************************************************************************
 *  Name:              Airish Christian P. Tabay
 *  Coursera User ID:  123456
 *  Last modified:     03/09/2023
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        // input values for cyan, magenta, yellow and black respectively
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // perform mathematical operation and typecast to int
        int white = (int) (1 - black);
        int red = (int) (255 * white * (1 - cyan));
        int green = (int) (255 * white * (1 - magenta));
        int blue = (int) (255 * white * (1 - yellow));

        // output RGB values
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
    }
}

