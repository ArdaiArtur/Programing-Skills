package Day8;

public class MergStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        for (int i = 0; i < n+m; i++) {
            if(i<n)
            sb.append(word1.charAt(i));
            if(i<m)
            sb.append(word2.charAt(i));
            if(i>n&&i>m)
            break;
        }
        return sb.toString();
    }
}
