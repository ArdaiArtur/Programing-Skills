package Day11;

public class ValidAnagam {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];       // create an array size of 26, all are initialized by zero
   
   for (int i = 0; i < s.length(); i++)        // for each character, increase the value by 1 at that particular index.
       alphabet[s.charAt(i) - 'a']++;
   
   for (int i = 0; i < t.length(); i++) 
       alphabet[t.charAt(i) - 'a']--;          // and now decrease the value of each in that same array
   
   for (int i : alphabet){             //Here we check, if the whole array having value zero then t is an anagram of s
       if (i != 0){                    // and return false
            return false;          
       }
   } 
   
   return true;               
   }
}
