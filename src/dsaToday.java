import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dsaToday {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<2){
            return ans;
        }
        int i=1;
        while (i<nums.length){
            if (nums[i] - nums[i-1] > 1){
                int gap = nums[i] - nums[i-1] - 1;
                int n = nums[i-1] + 1;
                while (gap>0){
                    ans.add(n);
                    n++;
                    gap--;
                }
                i++;
            }
            i++;
        }
        return ans;
    }
    static void main() {
    	System.out.println();
    }
}
