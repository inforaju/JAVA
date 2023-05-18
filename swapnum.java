// WAP to Swap two num

public class swapnum
{
    int a,b;
    public static void swapnumb(swapnum stn)
    {
        int temp;
        temp = stn.a;
        stn.a =stn.b;
        stn.b =temp;
    }
    public static void main(String arr[])
    {
        swapnum sn = new swapnum();
        sn.a=1;
        sn.b=2;
        System.out.println("a = "+sn.a+" b = "+sn.b);
        sn.swapnumb(sn);
        System.out.println("a = "+sn.a+" b = "+sn.b);

    }
}
