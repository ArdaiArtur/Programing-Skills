package Day6;

public class RichestCustomersWelth {
    public int maximumWealth(int[][] accounts) {
        int max=0;

        for (int i = 0; i < accounts.length; i++) {
            int curmax=0;
            for (int j = 0; j < accounts[0].length; j++) {
                curmax+=accounts[i][j];
            }
            System.out.println(curmax);
            max=Math.max(max, curmax);
        }
        return max;
    }
}
