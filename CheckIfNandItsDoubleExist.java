public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {

        int arr[] = {10,2,5,3};
        boolean na = checkIfExist(arr);

        System.out.println(na);
        
    }
    public static boolean checkIfExist(int[] arr) {
        // Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == 2 * arr[j] || arr[i]*2 == arr[j]){
                    return true ;
                }
            }
        }
        return false ;
    }
}
