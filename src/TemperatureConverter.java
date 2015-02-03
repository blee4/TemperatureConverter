/**
 * Created by SixDays on 2/2/15.
 */
public class TemperatureConverter {

    public static void main(String[] args) {
        if (args[0].equals("-f")) {
            // Conversion from Fahrenheit to Celsius
            secondArgCheck (args);
            int val = Integer.parseInt(args[1]);
            double celsius = (val - 32) * 5 / 9;
            System.out.printf("%d F is %f C.\n", val, celsius);
        }
        else if (args[0].equals("-c")) {
            // Conversion to Celsius from Fahrenheit
            secondArgCheck (args);
            int val = Integer.parseInt(args[1]);
            double fahrenheit = (val * 9 / 5) + 32;
            System.out.printf("%d C is %f F.\n", val, fahrenheit);
        }
        else {
            // Checking the first argument
            System.out.println ("Illegal first argument");
            System.out.println("Usage: TemperatureConverter <-f/-c> <int>");
            System.exit(0);
        }
    }

    private static boolean isInt (String temp) {
        try {
            Integer.parseInt(temp);
        }   catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static void secondArgCheck (String[] args) {
        if ((args.length != 2) || (!isInt(args[1]))) {
            // Check if second argument exists and if it is integer
            System.out.println ("Illegal second argument");
            System.out.println ("Usage: TemperatureConverter <-f/-c> <int>");
            System.exit(0);
        }
    }
}
