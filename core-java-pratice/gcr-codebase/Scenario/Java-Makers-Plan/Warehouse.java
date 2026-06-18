// A warehouse stores item quantities in an array. Find the max, min,
// total stock, and detect duplicates. Extend: rotate the stock array by
// k positions (simulate daily shift handover), and transpose a 2D shelf
// grid.


public class Warehouse {
    public static void main(String[] args) {
        int[] stock = {45,20,60,20,90,15,60};
        findMaxMin(stock, Integer.MIN_VALUE, Integer.MAX_VALUE);
        findsum(stock);
        searchItem(stock, 20);
        findDuplicates(stock);
        rotateArray(stock, 2);
        int[][] shelf = {
            {10, 20, 30},
            {40, 50, 60}
        };
        transposeMatrix(shelf);

    }
    public static void findMaxMin(int[] stock, int max, int min){
        for (int quantity : stock) {
            if (quantity > max) max = quantity;
            if (quantity < min) min = quantity;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    public static void findsum(int[] stock){
        int total = 0;
        for (int quantity : stock) {
            total += quantity;
        }
        System.out.println("Total Stock: " + total);
    }
    public static void searchItem(int [] arr , int target){
        boolean found = false;
        for (int quantity : arr) {
            if (quantity == target) {
                found = true;
                System.out.println("Item " + target + " found at index : " + found);
                break;
            }
        }  
        if(found==false) System.out.println("Item " + target + " not found in the warehouse.");
    }
    public static void findDuplicates(int [] arr){
        System.out.println("Duplicate items in the warehouse:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    public static void rotateArray(int[] arr , int n){
        int pos = n % arr.length;
        int[] rotated = new int[arr.length];
        for(int i=pos;i<arr.length;i++){
            rotated[i-2] = arr[i];
        }
        for(int i = pos-1;i>=0;i--){
            rotated[arr.length - pos + i] = arr[i];
        }
        System.out.print("Rotated Stock: ");
        for (int quantity : rotated) {
            System.out.print(quantity + " ");
        } 
    }
    public static void transposeMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}