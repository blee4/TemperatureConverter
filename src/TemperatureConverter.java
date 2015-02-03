/**
 * Created by SixDays on 2/2/15.
 */
public class TemperatureConverter {
    public static void main(String [] args) {
        double celsius, fahrenheit;
        if (args.length == 1) {
            System.out.println ("Usage: TemperatureConverter <base> <temp>");
            System.exit(0);
        }

        if (args[0].equals("-f")) {
            // Conversion from Fahrenheit to Celsius
            int val = Integer.parseInt(args[1]);
            celsius = (val - 32) * 5/9;
            System.out.printf("%dF is %fC.\n", val, celsius);
        }
        else if (args[0].equals("-c")) {
            // Conversion to Celsius from Fahrenheit
            int val = Integer.parseInt(args[1]);
            fahrenheit = (val * 9/5) + 32;
            System.out.printf("%dC is %fF.\n", val, fahrenheit);
        }
    }
}
