import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {65,34,76,89,70,20,56,44,32,10};
        
        System.out.println("Printing array elements");

        for(int i=0;i<=arr.length;i++){

            System.out.println(arr[i]);
        }

        
        System.out.println("Enter element to be found");
        int x= sc.nextInt();

        for(int i=0;i<=arr.length;i++){

            if(arr[i]==x){
                System.out.println(arr[i]);
            }
        }

        System.out.println("Element is found at index"+ arr[i]);

    }
}
