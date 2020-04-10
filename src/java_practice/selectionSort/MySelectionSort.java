package java_practice.selectionSort;

public class MySelectionSort {
    public void selectionSort(int[] arr){
        int maximumElement;
        int maximumElementIndex;
        int sortedIndex=arr.length;

        for(int i=0;i<arr.length;i++){
            maximumElement=arr[0];
            maximumElementIndex=0;
            //step 2
            // selecting maximum
            //find the maximum from the array
            for (int j = 0; j < sortedIndex ; j++) {
                if(arr[j]>maximumElement){
                    maximumElement=arr[j];
                    maximumElementIndex=j;
                }
            }
            //step 3
            //swap them
            int temp = arr[maximumElementIndex];
            sortedIndex --;
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr={25,2,8,3};
        MySelectionSort obj=new MySelectionSort();
        System.out.println("unsorted---->" );
    }
}
