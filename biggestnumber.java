//finding the biggest

public class biggestnumber
{
    public static void main(String arr[])
    {
        int a=10; int b=20; int c=30;
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        
        if((a>b)&&(a>c))
        {
            System.out.println("Var 1 is greater"+a);
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("Var 2 is greater"+b);
        }
        else
        {
            System.out.println("Var 3 is greater"+c);
        }
    }
}
