import java.util.Scanner;

public class khildi{

    public static void main(String[] args) {
        
        System.out.println("HEY BABY ENTER THE VALUE OF N");

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int sum =0;

        for(int i =0 ;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.print("the sum of natural number is \t");
        System.out.print(sum);


        sc.close();
    }
    
}
