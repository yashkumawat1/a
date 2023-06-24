import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        int no  = sc.nextInt();

        if(no%no==0)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }

        sc.close();

 

    }
    


}