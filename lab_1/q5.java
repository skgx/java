package lab_1;
import java.util.*;
public class q5 {

    public static void main(String args[]) {

        float celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit :");
        fahrenheit = sc.nextInt();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Celsius = " + celsius);
    }
}
