public class Fibonacci{  
public static void main(String args[])  
{    
 int f1=0,f2=1,f3,i,c=15;     
    
 for(i=2;i<c;++i)
 {    
  f3=f1+f2;    
  System.out.print(" "+f3);    
  f1=f2;    
  f2=f3;    
 }    
  
}}