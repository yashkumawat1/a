import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        int no  = sc.nextInt();

        for (int i = 0; i < no; i++) {

            if(i%no==0 && i%1==0)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
            
        }

        

        sc.close();

 

    }
    


}