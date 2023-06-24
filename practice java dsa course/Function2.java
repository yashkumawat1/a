import java.util.Scanner;

public class Function2 {

    public static void table(int no)
    {

          for(int i =1;i<=10;i++)

          {
            int sum = i*no;
            System.out.println(sum);
          }



    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value you want to show the table");

        int no = sc.nextInt();

        table(no);

        sc.close();

    }


    
}
