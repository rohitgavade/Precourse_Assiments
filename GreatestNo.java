public class GreatestNo {
    public static void main(String[] args) {
       int Num1 = 10;
       int Num2 = 130;
       int Num3 = 9;

       System.out.println("Greater no is : ");
       if(Num1>Num2 && Num1>Num3)
       {
           System.out.println(Num1);
       }
       else if(Num2>Num1 && Num2>Num3)
       {
           System.out.println(Num2);
       }
       else
       {
           System.out.println(Num3);
       }
    }
}
