package Day4;

import java.util.Arrays;

public class CanMakeArithmeticProggressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int si=Math.abs(arr[1]-arr[0]);
        for (int i = 2; i < arr.length; i++) {
            if(si!=Math.abs(arr[i]-arr[i-1]))
            return false;
        }
        return true;
    }
}
