package Day3II;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]+=1;
            return digits;
        }
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]==9)
            {
            digits[i]=0;
            if(i>0)
            digits[i-1]+=1;
            }
        } 
        if(digits[0]!=0)
        return digits;
        else
        {
            int[] a=Arrays.copyOf(digits, digits.length+1);
            a[0]=1;
            return a;
        }
        
    }
}
