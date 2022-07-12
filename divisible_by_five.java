import java.util.Scanner;

class divisible_by_five{
    public static void main(String[] args) {
        
        Scanner s =new Scanner (System.in);
        System.out.println("Enter a number");

        int i= s.nextInt();

        if(i%5==0)
        {
            System.out.println("Num is divisible by five");
        }
        else
        {
            System.out.println("Not divisible by five");
        }
    }
}