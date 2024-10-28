import java.util.HashMap;

public class LC_287 {
    int[] nums;

    public LC_287(int[] nums) {
        this.nums = nums;
    }

    public int findDuplicate() {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }

        return -1;
    }
}
