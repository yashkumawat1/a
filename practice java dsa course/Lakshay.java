import java.util.Scanner;

public class Lakshay {
    
    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
       
            System.out.println("enter the value of number");  
        if(no ==1)
        {
            
            System.out.println("Hello");
        }
         else if(no==2)
        {
            System.out.println("Namaste");
        }

        else if(no==3)
    {
        System.out.println("BONJOUR");
    }
    else
    {
        System.out.println("please enter only 1,2,3 to the effective response");
    }

     sc.close();
            
        


    }
}
