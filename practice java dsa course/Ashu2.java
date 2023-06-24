import java.util.Scanner;

public class Ashu2 {

    public static void main(String[] args) {

        System.out.println("number 1st for addition");
        System.out.println("number 2nd for substraction");
        System.out.println("number 3rd for multiplication");
        System.out.println("number 4th for division");
        System.out.println("number 5th for  modulus ");

        System.out.println("Enter the number you want to calculate");
        
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

       switch (no) {
        case 1:

        System.out.println("addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
            
            break;

            case 2:
            System.out.println("Substractiom");

            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = c-d;
            System.out.println(e);
            break;

            case 3:
            System.out.println("multiplication");

            int p = sc.nextInt();
            int o = sc.nextInt();
            int i= p+o;
            System.out.println(i);

            break;

            case 4:

            System.out.println("dividion");

            int q = sc.nextInt();
            int w = sc.nextInt();
            int div = q/w;
            System.out.println(div);

            break;

            case 5:
            System.out.println("modulus");

            int f = sc.nextInt();
            int g = sc.nextInt();

            int modu=f%g;
            System.out.println(modu);

            break;


       
        default:

        System.out.println("only 1 to 5 number keys is available");
            break;

       }
       sc.close();
    }
    
}
