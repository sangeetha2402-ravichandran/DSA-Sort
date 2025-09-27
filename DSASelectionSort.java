public class DSASelectionSort {

    public static void main(String[] args) {

        int nums[] = {6,8,2,4,3,5,1};
        int size = nums.length;
        int temp =0;
        int minIndex = -1;
        System.out.println("Array before sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }

        for(int i =0; i<size-1; i++){
            minIndex = i;
           for(int j=i+1; j<size; j++){
              if(nums[minIndex]>nums[j]){
                 minIndex = j;
              }
           }
           temp = nums[minIndex];
           nums[minIndex] = nums[i];
           nums[i] = temp;


        }
        System.out.println("\nArray after sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }

    }
}
