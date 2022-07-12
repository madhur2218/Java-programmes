import java.util.Scanner;

public class swapping_two_numbers {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int a= sc.nextInt();

        System.out.println("Enter second number");
        int b= sc.nextInt();

        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("NUMBERS AFTER SWAPPING ARE" + a + b);
        


        


    }
    
}
