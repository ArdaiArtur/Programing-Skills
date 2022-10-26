package Day1II;

public class FindeTheIndexOfFirstOccurrenceINAString {
    public int strStr(String haystack, String needle) {
       
        int j=0;
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                j++;
            }
            else
            {   if(j!=0)
                i=i-j+2;
            j=0;                       
            }
            if(j==needle.length())
            return i-j+1;
        }
        
        return -1;
    }
}
