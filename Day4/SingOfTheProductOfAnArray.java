package Day4;



public class SingOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        long man=0;
        for (int i : nums) {
            if(i<0)man++;
            if(i==0) return 0;
        }
       
        if(man%2==0) return 1;
        else return -1;
       
    }
}
