import java.util.Scanner;

public class even {

    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        int no = sc.nextInt();
        for (int i = 0; i <=no; i=i+2) {

            System.out.println(i);
            
        }


sc.close();
    }

}