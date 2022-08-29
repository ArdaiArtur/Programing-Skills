package Day6;

public class MoveZerose {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length)
        {
            if(nums.length>j)
            {
                if(nums[j]!=0)
                {
                nums[i]=nums[j];
                i++;
                }

            }
            else{
                nums[i]=0;
                i++;
            }
            j++;
        }
    }
}
