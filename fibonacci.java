class fibonacci
{
    public static void main(String arr[])
    {
        int i;
        int a=0,b=1,c=0,d=0;
        System.out.print(a+" "+b);
        for(i=2;i<=10;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            d=d+c;
        }
       // System.out.println(" ");
        System.out.println("\n Sum "+d);
    }
}