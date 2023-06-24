import java.util.Scanner;

public class ThirteenClass {
    
public static void add(int a , int b)
{
    System.out.println("the sum of two number is");
    System.out.println(a+b);
}

public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);

      System.out.println("enter the value of q");
       int q = sc.nextInt();
       System.out.println("enter the value of w");
       int w   =  sc.nextInt();

       add(q,w);
       sc.close();

}


}
