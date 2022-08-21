package Day2;

public class NumberOf1Bits {
    public int hammingWeight1(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count ++;
            }
        }
        
        return count;
    }


    public int hammingWeight(int n) {
        int ans = 0;
    
        while (n != 0) {
          ans += n & 1;
          n >>>= 1;
        }
    
        return ans;
      }
}
