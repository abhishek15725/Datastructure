package java_practice.search;

import java.util.*;

public class MyBinarySearchIterative {
    private int[] arr;
    public MyBinarySearchIterative(int[] arr){
        this .arr=arr;
    }


    public boolean binarySearch(int searchElement){
        int low = 0 ;
        int high = arr.length-1;
        while(low <=high){
            int mid =(low +high)/2;
            System.out.println();
            if(searchElement == arr[mid]){
                return true;
            }
            else if (searchElement < arr[mid]){
                high =mid -1;

            }
            else{
                low =mid +1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] sortedArray={10,20,30,50,60,70,80,90,100};
        System.out.println("enter the no.");
        int searchElement=sc.nextInt();
        MyBinarySearchIterative obj=new MyBinarySearchIterative(sortedArray);
        boolean result=obj.binarySearch(searchElement);
        if (result) {
            System.out.println();

        }

    }
}
