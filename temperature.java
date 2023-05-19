import java.util.Scanner;
public class temperature
{
    public static void main(String arr[])
    {
        float fahrenheit, celsius;

        Scanner  sc = new  Scanner(System.in);
        System.out.println("Enter the temperature in  Fahrenheit :");
        fahrenheit = sc.nextFloat();

        // Coverting Fahrenheit to Celsius 
        celsius = (float) ((fahrenheit-32)/1.8);

        System.out.println("Equivalent temp in Celsius   = " + celsius);
    }
}