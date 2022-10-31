package Day6II;

public class DayliTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int i=0,j=1;
        int n=temperatures.length;
        int []a=new int [n-1];
        
        while(i<n&&j<n)
        {
            if(j<n)
            {
            if(temperatures[i]<temperatures[j])
            {
                a[i]=j-i;
                i++;
                j=i+1;

            }
            else
            j++;
        }
        else
        {
            i++;
            j=i+1;
        }


        }
        return a;
    }
}
