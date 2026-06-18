// 2. Warehouse Stock Recovery System 
// A warehouse stores the stock count of products in an array. Due to a software glitch, exactly one product's stock value has become 0.
// Write a program that:
// Accepts stock quantities for N products.
// Identifies the position where stock became 0.
// Finds the average stock of all non-zero products.
// Replaces the missing stock with the average value.
// Displays the updated inventory.

import java.util.*;
public class Warehouse_Stock {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number of stocks count: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos=0;
        int avg=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the element no. "+i+" : ");
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                pos=i;
            }
            avg+=arr[i];
        }
        avg = avg/n;
        arr[pos]=avg;
        System.out.println("updated Invetory: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
