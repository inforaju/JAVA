// public class Constructor {
//     int x;

//     public Constructor(){
//         x=5;

//     }

//     public static void main (String[] args)
//     {
//         Constructor myObj = new Constructor();
//         System.out.println(myObj.x);
//     }
// }


public class Constructor
{
    int modelYear;
    String modelName;
    
    public Constructor(int year, String name)
    {
        modelYear = year;
        modelName = name;
    }
    
    public static void main(String[] args)
    {
        Constructor myCar = new Constructor(2000,"Martin");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}