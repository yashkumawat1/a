import java.util.Scanner;

public class Ashu {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int no  = sc.nextInt();
        switch (no) {
            case 1:
            System.out.println("hello");
                
                break;

                case 2: 
                System.out.println("namaste");
                break;
                case 3:

                System.out.println("baddashah");
                break;
        
            default:
            System.out.println("hey man you enetr wrong key");
                break;
        }
        sc.close();


     
    }
    
}
