package basic4;

public class binarySearchClassic {
    public int binarySearchC(int[] input, int target){
        if(input == null || input.length == 0){
            return -1;
        }
        int l = 0;
        int r = input.length -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(input[mid] == target){
                return mid;
            }else if(input[mid] > target){
                r = mid -1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int t = 4;
        System.out.print(new binarySearchClassic().binarySearchC(arr,t));
    }

}
