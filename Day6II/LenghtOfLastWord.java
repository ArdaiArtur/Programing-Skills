package Day6II;

public class LenghtOfLastWord {
    public int lengthOfLastWord(String s) {
        String[]ss=s.split(" ");
        return ss[ss.length-1].length();
    }
}
