import java.sql.SQLOutput;

public class DSABubbleSort {

    public static void main(String[] args) {

        int nums[] = {6,8,2,4,3,5,};
        int size = nums.length;
        int temp;
        System.out.println("Array before sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }

        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size-1; j++)
            {
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }

            }
        }

        System.out.println("\nArray after sorting");
        for(int num: nums){
            System.out.print(num+" ");
        }

    }
}
