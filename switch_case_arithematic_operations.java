import java.util.Scanner;

public class switch_case_arithematic_operations {
public static void main(String[] args) {

    Scanner s=new Scanner (System.in);
    System.out.println("Enter numbers ");
    int c;
    int i = s.nextInt();

    System.out.println("Enter vakue of a and b");
    int a = s.nextInt();
    int b=s.nextInt();

    switch (i){

        case 1:
             c =a+b;
            System.out.println("Sum of numbers is"+ c);
            break;
        
            case 2 :

             c =a-b;
            System.out.println("Diff of numbers is"+ c);
            break;
            
            case 3 :

             c =a*3b;
            System.out.println("Prod of numbers is"+ c);
            break;
    }

    
    
}
}
