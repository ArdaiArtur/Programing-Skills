package Day11;

import java.util.HashMap;

public class ContainsDuplicats {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
          int s=nums.length;
          for (int i = 0; i < s; i++) {
              if(!hs.containsKey(nums[i]))
              {
                  hs.put(nums[i], i);
              }
              else
              {
                  return true;
              }
          }
          return false;
      }
}
