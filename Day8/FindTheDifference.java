package Day8;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int []cnt=new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if(cnt[t.charAt(i)-'a']==0)
            return t.charAt(i);
            cnt[t.charAt(i)-'a']--;
        }
        return ' ';
    }
}
