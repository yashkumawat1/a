import java.util.Scanner;

public class KhushiClass {

    public static void main(String[] args) {
        

      Scanner sc = new Scanner(System.in);

      System.out.println("enter the number");

      int no = sc.nextInt();
      if(no%2==0)
      {
        System.out.println("the number is EVEN");
      }
      else if(no==27)

      {

        System.out.println("the numebr is ZERO");
      }
      else{
        System.out.println("the numebr you enter is odd number");
      }


      sc.close();




    }
    
}
