import java.util.*;
public class greater_between_numbers {

    public static void main(String[] args) {
        
        System.out.println("Enter two numbers");
        Scanner sc =new Scanner (System.in);

        int a = sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println("A is greater than B");
        }
        else if (b<a){
            System.out.println("B is greater than A");
        }
        else{

            System.out.println("A and B are equal");
        }
           
        

    }
    
}
