import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
       int x= sc.nextInt();
      	int  y=sc.nextInt();
       int z=sc.nextInt();
       int n=sc.nextInt();
      int arr[] = new int[]{x,y,z};
      int count =0;
      if(n==0)
        {
          count =0;
        }
      else{
      for (int i=0;i<arr.length;i++){
        
      if(arr[i]>=n)
      {
        count++;
      }
      
      }
      }
      System.out.println(count);
      
    }
}