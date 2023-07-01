import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int arr[][] = new int[a][b];
        

        for(int i =0; i< arr.length; i++)
        {
            for(int o =0; o <arr[0].length;o++)
            {
                
                arr[i][o] = sc.nextInt();


            }
        }

          for(int i =0; i< arr.length; i++)
        {
            for(int o =0; o <arr[0].length;o++)
            {
                
                System.out.print(arr[i][o]);
                

            }

            System.out.println(" ");
            sc.close();
        }



    }

    
}
