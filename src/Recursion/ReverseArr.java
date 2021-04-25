package Recursion;

public class ReverseArr {
    public static void reverseArray(int[] arr, int start, int end){
        int temp;
        if(start >= end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
    public static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,7,6};
        printArray(arr, 5);
        reverseArray(arr, 0, 4);
        System.out.println("Array in reverse order:");
        printArray(arr, 5);
    }
}
