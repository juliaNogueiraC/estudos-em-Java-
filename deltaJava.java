import java.util.Scanner;
public class Main{
 public static void main (String[]args){
    Scanner ent = new Scanner(System.in);
    float a, b , c;
    double delta;
    
    
    System.out.println("coeficiente a:");
    a = ent.nextInt();
    
    System.out.println("coefciente b:");
    b = ent.nextInt();
    
    System.out.println("coeficeinte c :");
    c = ent.nextInt();
    
    delta = (b*b)+((-4)*(a)*(c));
    System.out.println(delta);
  }
 
 }