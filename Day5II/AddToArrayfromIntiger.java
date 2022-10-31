package Day5II;

import java.util.ArrayList;

import java.util.List;

public class AddToArrayfromIntiger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>fin=new ArrayList<>();
        for (int i = num.length-1; i >=0; i--) {
            if(k>0)
            {
                num[i]+=k%10;
                k/=10;
                if(num[i]>9)
                {
                    num[i]=num[i]%10;
                    k++;
                }
            }
            else break;
        }
       
        
        {
        while(k>0)
        {
            fin.add(0, k%10);
            fin.add(k%10);
            k/=10;
        }
        
        
        }
        for (Integer integer : num) {
            fin.add(integer);
        }
        return fin;
    }
}
