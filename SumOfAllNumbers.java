
import java.util.Scanner;
public class SumOfAllNumbers
{
    public static void main(String arr[])
    {
        int i=0,num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = sc.nextInt();
        while(i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of all the natural number till " +num+ " is " + sum);
    }
}



