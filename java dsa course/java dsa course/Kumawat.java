import java.util.Scanner;

public class Kumawat {

    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b =  sc.nextInt();
        int sum = a+b;

        System.out.println("the sum of number is " + sum);

        sc.close();
    }
}