class Solution {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                }
            }
        }
    }
}
