import java.util.Scanner;

public class Function1 {

    public static void even(int no)

    {
        if(no%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER TO CHECK THE NUMEBR IS EVEN OR ODD");

        int no = sc.nextInt();

        even(no);

        sc.close();
        
    }
    
}
