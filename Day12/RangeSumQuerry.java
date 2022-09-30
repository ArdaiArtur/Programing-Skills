package Day12;

public class RangeSumQuerry {
    int[] nums;
    public RangeSumQuerry(int[] nums) {
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int a=0;
        for (int i = left; i <= right; i++) {
            a+=nums[i];
        }
        return a;
    }
}
