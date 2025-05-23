import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = sc.nextInt() ;
        }

        System.out.println(findPeakElement(nums));
        
    }
    public static int findPeakElement(int[] nums) {
        int start = 0 ;
        int end = nums.length - 1 ;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[mid+1]){
                end = mid ;
            }
            else{
                start = mid + 1 ;
            }
        }

        return start;
    }
}
