import java.util.*;
public class Main{
 public static void main(String[] args){
   String name,skill;
   long id;
   //System.out.println("Enter");
   Scanner sc=new Scanner(System.in);
   name=sc.nextLine();
  id=sc.nextLong();
   sc.nextLine();
skill=sc.nextLine();
  ProGrad pg1=new ProGrad(name,id,skill);
    pg1.print();
  }
}
class ProGrad
{
 String name;
  long id;
  String skill;
  ProGrad(String n,long i,String s){
  this.name=n;
  this.id=i;
  this.skill=s;
  }
  public void print()
  {
    if(this.id>0 && this.name != null && this.name.matches("^[a-zA-Z\\s]*$"))
     System.out.println("ProGrad Details\nProGrad Name: "+name+"\nId: "+id+"\nSkill: "+skill);
    else
      System.out.println("Invalid Input");
  }
}