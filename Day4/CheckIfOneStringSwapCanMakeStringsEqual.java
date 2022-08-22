package Day4;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        
        int count=0;
        int[]ar=new int [26];
        int []br=new int[26];
        if(s1.length()!=s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)) count++;
            if(count>=3) return false;
            ar[s1.charAt(i)-'a']++;
            br[s2.charAt(i)-'a']++;
        }
        for (int i = 0; i < ar.length; i++) {
            if(br[i]!=ar[i]) return false;
        }
        return true;
        
    }
}
