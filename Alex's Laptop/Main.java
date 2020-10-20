// Laptop Details : 

// Laptop Brand: Dell

// Processor Name: Intel Core i5-5675C

// OS: Windows

// Processor Range: 64 bit

// Ram: 8 GB

import java.util.*;
public class Main{
 public static void main(String[] args){
    String brand,os;
   String pros;
  int range,ram;
  
   Scanner sc=new Scanner(System.in);
   brand=sc.nextLine();
   pros = sc.nextLine();
   os = sc.nextLine();
   range= sc.nextInt();
   ram= sc.nextInt();
  
  Laptop pg1=new Laptop(brand,pros,os,range,ram);
    pg1.displayLaptopDetails();
  }
}
class Laptop
{
  String brand,os;
   String pros;
  int range,ram;
  Laptop(String b,String p ,String o,int ra,int r){
  this.brand=b;
  this.pros=p;
  this.os=o;
    this.range=ra;
    this.ram=r;
  }
  public void displayLaptopDetails()
  {
    if(this.ram>0 &&range>0 && this.brand != null && this.brand.matches("^[a-zA-Z\\s]*$"))
     System.out.println("Laptop Details \n"+"Laptop Brand: "+brand+"\nProcessor Name: "+pros+"\nOS: "+os+"\nProcessor Range: "+range+" bit\nRam: "+ram+" GB");
    else
      System.out.println("Invalid Input");
  }
}