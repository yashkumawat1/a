import java.util.Scanner;

public class Array {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc .nextInt();

        int marks[] = new int[size];

        for(int o =0; o<size;o++)
        {
            
            marks[o] = sc.nextInt();

        }

        // marks[0] = 5;
        // marks[1] = 10;
        // marks[2] = 20;
        // marks[3] = 30;
        // marks[4] = 40;
        // marks[5] = 50;
        int max = marks[0];

        for(int i =1; i<marks.length; i++)
        {
            if(marks[i] > max)
            {
               
            // System.out.println(marks[i]);
             max= marks[i];
            
            }
           

        }
          System.out.println(  "this is the maximum term in this array"+ max);
        sc.close();
        
    }

}