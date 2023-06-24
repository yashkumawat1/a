import java.util.Scanner;

public class Ashu1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the MONTH  number FROM 1 TO 12");

        int no = sc.nextInt();

        switch (no) {
            case 1:
            System.out.println("january");
                
                break;

                case 2:
                System.out.println("febuary");
                break;
                case 3:
                System.out.println("march");

                break;

                case 4:
                System.out.println("apral");

                break ;

                case 5:
                System.out.println("may");

                break ;

                case 6:

                System.out.println("june");

                break ;

                case 7:
                System.out.println("july");

                break;

                case 8 :
                System.out.println("auguest");

                break;

                case 9:
                System.out.println("september");

                break ;

                case 10 :
                System.out.println("octomber");

                break ;

                case 11: 
                System.out.println("november");
                break ;

                case 12 :
                System.out.println( "DECEMBER");
                break;
        
            default:
           System.out.println("month number are between only rely 1 to 12");
                break;
        }
        sc.close();


    }
}