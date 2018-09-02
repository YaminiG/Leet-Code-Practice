class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = binarySearch(nums, 0, nums.length-1, target);
        if(index==0){
            index = insertInPlace(nums, target);
        }
        return index;
        
    }
    public int insertInPlace(int[] nums, int target){
        int index = 0;
        for(int i = 0 ;i < nums.length; i++){
            if(nums[i]>=target){
                return index;
            }
            index++;
        }
        return index;
        
    }
    public int binarySearch(int[]nums, int startindex, int endindex, int target){
        int index = 0;
        if(startindex> endindex){
            return 0;
        }
        int mid = (startindex + endindex) / 2;
        if(target == nums[mid]){
            return mid;
        }
        else if(target<nums[mid]){
                index = binarySearch(nums, startindex, mid-1, target);
            }
        else if(target>nums[mid]){
            index = binarySearch(nums, mid+1, endindex, target);
        }
        return index;
        
    }
}
