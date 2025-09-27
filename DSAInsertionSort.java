public class DSAInsertionSort {

    public static void main(String[] args) {

        int nums[] = {6,8,2,4,3,5};
        int size = nums.length;
        int key,j ;
        System.out.println("Array before sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }
        for(int i =1; i<size; i++){
            key = nums[i];
            j= i-1;

           while(j >= 0 && nums[j] > key) {
             nums[j+1] = nums[j];
             j--;

           }
           nums[j+1] = key;
        }
        System.out.println("\nArray after sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }

    }
}
