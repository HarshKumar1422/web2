import java.util.*;  
public class q11 {
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter number- ");  // taking input number
        int a= sc.nextInt(); 
        if(a>=80&&a<=90) // if else logic
        a=a+5;
        System.out.print(a); 

      }
}
