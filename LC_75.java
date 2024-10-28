public class LC_75 {
    int[] nums;

    public LC_75(int[] nums) {
        this.nums = nums;
    }

    public int[] sortColors(){
        int zeroCounter = 0, oneCounter = 0, twoCounter = 0;

        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == 0){
                zeroCounter++;
            } else if (nums[i] == 1){
                oneCounter++;
            } else if (nums[i] == 2){
                twoCounter++;
            }
        }

        for (int i = 0; i < zeroCounter; i++){
            nums[i] = 0;
        }

        for (int i = zeroCounter; i < zeroCounter + oneCounter; i++){
            nums[i] = 1;
        }

        for (int i = zeroCounter + oneCounter; i < zeroCounter + oneCounter + twoCounter; i++){
            nums[i] = 2;
        }

        return nums;
    }

}
