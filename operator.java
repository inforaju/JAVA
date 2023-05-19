//										CALCULATOR PROGRAM


import java.util.Scanner;
public class operator
{
    public static void main(String arr[])
    {
        Scanner sc = new Scanner(System.in);
        float  num1,num2,res = 0;
        char ch;
        
        // Take input from the user
        System.out.println("Enter any two numbers");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        
        // Input for Operator
        System.out.println("Enter any operator (+,-,*,/):  ");
        ch = sc.next().charAt(0);
        // if(ch == '+') res = num1 + num2;
        switch(ch)
        {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Result = " + res);
    }
}