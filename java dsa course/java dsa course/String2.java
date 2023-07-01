public class String2 {

    // concatination

    public static void main(String[] args) {
        
        String firstName = "yash";
        String lastName = "kumawat";


        String fullname = firstName + " " +  lastName;

        System.out.println(fullname.length());

        for(int i =0 ; i<fullname.length(); i++)
        {
             
            System.out.println(fullname.charAt(i));
        }
    }
    
}
