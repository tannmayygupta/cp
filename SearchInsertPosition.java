public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2 ;

        int x = searchInsert(arr , target);
        
        System.out.println(x);
        
    }
    public static int searchInsert(int[] arr, int target) {
        int left = 0 ; 
        int right = arr.length - 1 ;

        while(left <= right){
            int mid = (left + right) / 2 ;
            if(arr[mid] == target){
                return mid ;
            }
            else if(arr[mid] > target){
                right = mid - 1 ;

            }
            else{
                left = mid + 1 ;
            }
        }
       return left ;
    }
}
