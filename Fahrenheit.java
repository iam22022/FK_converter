import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the Fahrenheit the temp: ");
        float temperature = scan.nextFloat();
        temperature = (float) ((temperature + 459.67) * 5/9);
        System.out.println("The temp is: " + temperature);

    }
}
