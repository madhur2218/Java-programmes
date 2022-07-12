import java.util.Scanner;

public class area_of_circle {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        float area;
        float pi=3.14f;
        
        System.out.println("Enter value of radius");
        float r = sc.nextFloat();
        area= pi * r * r;

        System.out.println("Area of circle is " + area);
    }
    
}
