import java.util.Scanner;

public class RahulClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else if(b>a)
        {
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("A and B are equal");
        }


    sc.close();    

    
    }

    
    
}
