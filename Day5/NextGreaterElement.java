package Day5;

import java.util.HashMap;


public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
          
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            int j=i+1;
            int put=-1;
            if(j<nums2.length&&nums2[i]<nums2[j])put=nums2[j];
       while (j<nums2.length&&nums2[i]>nums2[j])  {
                 
               if(j+1<nums2.length&&nums2[i]<nums2[j+1])
                put=nums2[j+1];
              j++;
            }
          
            hm.put(nums2[i], put);
            
            
        }
        int []ret=new int [nums1.length];
       for (int i = 0; i < nums1.length; i++) {
        ret[i]=hm.get(nums1[i]);
       }
        return ret;
       
           
        
    }
}
