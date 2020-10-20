// Name of the dog: Lulu
// Weight of the dog: 6.2
// Age of the dog: 4
// Color of the dog: White
// Breed of the dog: Maltese

import java.util.*;
public class Main{
 public static void main(String[] args){
    String name,color,bread;
   int age;
  double weight;
  
   Scanner sc=new Scanner(System.in);
   name=sc.nextLine();
   weight = sc.nextDouble();
   age = sc.nextInt();
   sc.nextLine();
  color= sc.nextLine();
  bread= sc.nextLine();
  
  Dogs pg1=new Dogs(name,weight,age,color,bread);
    pg1.print();
  }
}
class Dogs
{
 String name,color,bread;
   int age;
  double weight;
  Dogs(String n,double w ,int a,String c,String b){
  this.name=n;
  this.weight=w;
  this.age=a;
    this.color=c;
    this.bread=b;
  }
  public void print()
  {
    if(this.age>0 && this.weight>0 && this.name != null && this.name.matches("^[a-zA-Z\\s]*$"))
     System.out.println("Name of the dog: "+name+"\nWeight of the dog: "+weight+"\nAge of the dog: "+age+"\nColor of the dog: "+color+"\nBreed of the dog: "+bread);
    else
      System.out.println("Invalid Input");
  }
}