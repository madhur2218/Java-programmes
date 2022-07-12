import java.util.Scanner;

public class odd_even_without_modulus_and_bitwise_operator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");

        int i= sc.nextInt();

        if(i/2*2==i){
            System.out.println("Number is even");
        }
        
        else{
            System.out.println("Number is odd");

        }
    }
    
}
