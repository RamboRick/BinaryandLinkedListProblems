package basic4;

public class LastOccurance {
    public int lastOccurance(int[] input, int target){
        if(input == null || input.length == 0){
            return -1;
        }
        int l = 0;
        int r = input.length -1;
        while(l < r - 1){
            int mid = l + (r - l)/2;
            if(input[mid] == target){
                l = mid;
            }else if(input[mid] > target){
                r = mid;
            }else {
                l = mid;
            }
        }
        if(input[r] == target){
            return r;
        }
        if(input[l] == target){
            return l;
        }
        return -1;
    }
}
