import java.util.Scanner;

public class switch_case_odd_even {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to check if number is odd \n Press 2 to check if number is even");
        int i = sc.nextInt();
        System.out.println("Enter the number");
        int a= sc.nextInt();

        switch (i){

            case 1:
                if(a%2==0){
                    System.out.println("Number is even");
                    break;
                }

            case 2 :

                if(a%2!=0){
                    System.out.println("Number is odd");

                }

                }
        }

    }
    
}
