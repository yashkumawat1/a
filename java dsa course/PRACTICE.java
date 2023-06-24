import java.util.Scanner;

public class PRACTICE {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of number which you wnat the table");

        int no = sc.nextInt();

        for(int i =0; i<=10;i++)
        {

            System.out.println(i*no);
            
        }
        sc.close();
       
    }
    

}