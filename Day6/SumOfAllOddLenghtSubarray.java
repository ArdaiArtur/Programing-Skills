package Day6;

public class SumOfAllOddLenghtSubarray {
    public int sumOddLengthSubarrays(int[] arr) {
       int k=2;
       int n=arr.length;
       for (int i = 1; i < arr.length; i++) {
        arr[i]=arr[i]+arr[i-1];
        
       }
       int sum=2*arr[n-1];
        while(k<arr.length)
        {   
            for (int i = 0; i+k < arr.length; i++) {
                if(i>0)
                sum+=arr[k+i]-arr[i-1];
                else
                sum+=arr[k+i];
            }
            k+=2;
        }
        return sum;
    }
}
