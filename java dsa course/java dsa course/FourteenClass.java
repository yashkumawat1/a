import java.util.Scanner;

public class FourteenClass {

    
    public static int add(int a , int b)
    {
        int sum = a*b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc =   new Scanner(System.in);


        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        int sum = add(a,b);
        System.out.println( "the multiply of two number is " +sum);
        sc.close();


        // it is a return type of the any function;

        









    }


}