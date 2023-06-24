import java.util.Scanner;

public class FifteenClass {

    public static int multiply(int d , int f)
    {
        return d*f;

      }
    public static void main(String[] args) {
        

   Scanner sc = new Scanner(System.in);

              
            System.out.println("enter the value of a");             
         int a = sc.nextInt();

          System.out.println("entr the value of b");

         int b = sc.nextInt();

        
        // multiply(a, b);

         System.out.println("the product of two number is " + multiply(a, b) );


         sc.close();


    }
    
}

