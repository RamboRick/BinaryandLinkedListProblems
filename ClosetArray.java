package basic4;

public class ClosetArray {
    public int closetArray(int[] input, int target){
        if(input == null || input.length == 0){
            return -1;
        }
        int l = 0;
        int r = input.length -1;
        while(l < r - 1){
            int mid = l + (r - l)/2;
            if(input[mid] == target){
                return mid;
            }else if(input[mid] > target){
                r = mid;
            }else {
                l = mid;
            }
        }
        if(Math.abs(input[l] - target) > Math.abs(input[r] - target)){
            return r;
        }
        return l;
    }
}