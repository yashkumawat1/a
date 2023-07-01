import java.util.Scanner;

public class JaiClass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size =  sc.nextInt();

        int famname[] = new int[size];

        for(int i =0 ; i<size;i++)
        {
           famname[i] = sc.nextInt();
        }

        for(int d=0; d<size; d++)
         {

            

            System.out.println(famname[d]);

         }
         sc.close();


    }
}