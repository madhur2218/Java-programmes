import java.util.*;
public class ascending_order_array {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        int size ;
        

        System.out.println("Enter size of array");
        size = sc.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter elements in array");

        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }
        System.out.println("Printing out the array");
        
        for(int i=0; i<=arr.length;i++){
            System.out.println(arr[i]);
        }   

        System.out.println("Printing array in ascending order");

        int temp;

        for(int i=0;i<=arr.length;i++){
            for(int j=arr[i]+1;j<=arr.length;j++){

                if(arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array is ascending order is");

        for (int i = 0; i <=arr.3length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }
}
 
    

