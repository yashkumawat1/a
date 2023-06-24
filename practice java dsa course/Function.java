import java.util.Scanner;

public class Function {

    public static void prime(int a)
    {

        if(a%2==1 && a/a==1)
        {
            System.out.println("number is prime ");
        }
        else
        {
            System.out.println("number is not prime");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          System.out.println("enter the numeber you want prime or not");

       int no = sc.nextInt();

     

       prime(no);

        

        sc.close();


        
        
    }
    
}
