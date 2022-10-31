package Day5II;

public class AddBinary {
    public String addBinary(String a, String b) {
        boolean oneplus=false;
       String s="";
       int i=a.length()-1,j=b.length()-1;
       while (i>=0&&j>=0) {
       
       if(a.charAt(i)=='1'&&b.charAt(j)=='1')
       {
           if(oneplus)
        {
           s='1'+s;
           
        }
        else
        {
           s='0'+s;
           oneplus =true;
        }

       }
       else if(a.charAt(i)=='1'||b.charAt(j)=='1')
       {
           if(oneplus)
           {
               s='0'+s;
               
           }
           else
           {
               s='1'+s;
           }
       }
       else if(a.charAt(i)=='0'&&b.charAt(j)=='0')
       {
           if(oneplus)
           {
               s='1'+s;
               oneplus=false;
           }
           else
           {
               s='0'+s;
           }
       }
          i--;j--;
       }
       if(j==-1)
       {
           if(oneplus)
           {
               while(i>=0&&a.charAt(i)=='1')
               {
                   s='0'+s;
                   i--;
               }
               if(i>=0&&a.charAt(i)=='0')
               {
                   s='1'+s;
                   oneplus=false;
               }
               i--;
           }
           if(i>=0)
           s=a.substring(0, i+1)+s;
       }
       if(i==-1)
       {
           if(oneplus)
           {
               while(j>=0&&b.charAt(j)=='1')
               {
                   s='0'+s;
                   j--;
               }
               if(j>=0&&b.charAt(j)=='0')
               {
                   s='1'+s;
                   oneplus=false;
               }
               j--;
           }
           if(j>=0)
           s=b.substring(0, j+1)+s;
       }

     return oneplus?'1'+s:s;
   
   }
}
