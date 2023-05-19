import java.util.Scanner;
public class leap{
    public static void main(String arr[]){
        int year;
        System.out.println("Enter the year you want to check");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ((year % 400 == 0) && (year % 100 == 0))
        System.out.println(year + "is leap year");
        else if ((year % 4 == 0) && (year % 100 != 0))
        System.out.println(year + " is leap year ");
        else
        System.out.println(year + " is not a leap year ");

    }
}