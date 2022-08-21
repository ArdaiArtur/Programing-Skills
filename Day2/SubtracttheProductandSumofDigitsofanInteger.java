package Day2;

public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int product=0;
        int sum=0;
        while(n!=0)
        {
            product*=n%10;
            sum+=n%10;
            n=n/10;
        }
        System.out.println(product+" "+sum);
        return product-sum;
    }
}
