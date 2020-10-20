
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			List<Integer> list = new ArrayList<Integer>();
			Scanner scanner = new Scanner(System.in);
			int count = 0;
			int n =scanner.nextInt();
		//	Boolean res = new Boolean(n);
			if(n<1)
			{
				System.out.println("Invalid Input");
			}
			else 
				{
			
			
			for(int i =0;i<n;i++)
			{
				int x =scanner.nextInt();
	              list.add(x);
			}
			
			 for (int i = 0; i < list.size(); i++) {
		            boolean isPrime = true;
		            if (list.get(i) == 1)
		                isPrime = false;
		            else {
		                // check to see if the numbers are prime
		                for (int j = 2; j <= list.get(i) / 2; j++) {
		                    if (list.get(i) % j == 0) {
		                        isPrime = false;
		                        break;
		                    }
		                }
		            }
		            // print the number
		            if (isPrime)
		            	count++;
		                
		        }
			 System.out.println("Number of prime marks: "+count);
		    }
			
			
				}
		}
	
	
	
