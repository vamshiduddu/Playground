import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
           //System.out.println(n);
      int[] arr1= new int[n];
      int[] arr2= new int[n];
     
      for(int i=0;i<n;i++)
      {
          arr1[i]=sc.nextInt();
         //  System.out.println(arr1[i]);
       
         
    }
        
    for(int i=0;i<n;i++)
    {
         int sum=0;
      arr2[i]=sc.nextInt();
      // System.out.println(arr2[i]);
      sum+=arr1[i]+arr2[i];
       System.out.println(sum);
          
    }
    }
   
      
}