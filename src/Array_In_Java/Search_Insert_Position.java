package Array_In_Java;

public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
            else{
                if (target != nums[i] && nums[i] >= target){
                    index = i;
                    nums[index++] = nums[i];
                    nums[i] = target;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        searchInsert(new int[]{1,2,3,4,5},7);
    }
}
