// WAP to Reverse a Number 

// public class palindrome
// {
//     public static void main(String arr[])
//     {
//         int num=121,reversed =0,digit;

//         System.out.println("Original number " + num);

//         // Run while loop until num becomes 0
//         while(num!=0)
//         {
//             digit = num %10;
//             reversed = reversed * 10 + digit;

//             // remove the last digit from  the num 
//             num = num /10;
//         }
//         System.out.println("Reversed Number : " + reversed);
//     }
// }

// ----------------------xxx-xxxxx-x-x-x-x-x-x-x--x-x-==================================

// WAP to Check a Number is Palindrome or Not 

// import java.util.Scanner;
// public class palindrome
// {
//     public static void main(String arr[])
//     {
//         int num,temp,reversed=0,rem=0;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number : ");
//         num = sc.nextInt();

//         temp=num;
//         while(temp!=0)
//         {
//             rem = temp %10;
//             reversed = reversed * 10 + rem;
//             temp = temp/10;
//         }
//         if(num==reversed)
//             System.out.println("\nIt is a Palindrome Number.");
//         else
//             System.out.println("\nIt is not a Palindrome Number.");
//     }
// } 

// ----------------------xxx-xxxxx-x-x-x-x-x-x-x--x-x-==================================

// WAP to Reverse a String 

import java.util.Scanner;
public class palindrome
{
    public static void main(String arr[])
    {
        String str,rev="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");

        str = sc.nextLine();

        // Loop in Reverse Order 
        for(int i=str.length()-1; i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String :" + rev);
    }   
}


