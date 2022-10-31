package Day6II;

import java.util.Stack;

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

    public int[] dailyTemperature(int[] temperatures)
    {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int []a=new int [n];

        for (int i = n-1; i >=0; i--) {
            while (!st.isEmpty()&&temperatures[i]>=temperatures[st.peek()]) {
                st.pop();
            }
            if(!st.isEmpty())
            {
                a[i]=st.peek()-i;
            }
            st.add(i);
        }
        return a;
    }

}
