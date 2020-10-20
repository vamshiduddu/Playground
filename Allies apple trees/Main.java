
import java.util.*;
class Main
{
 private static int sqaurePlotToBuy(int minApples) {
      double totalApplesInSquare = 0;
      int unit =0;
      while(minApples>totalApplesInSquare){
      unit++;

      totalApplesInSquare +=12*Math.pow(unit,2);
      }

      return unit*8;
   }
  public static void main(String args[])
  {
 Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
    System.out.println(sqaurePlotToBuy(x));
  }
}