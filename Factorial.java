class Factorial
{
 public static void main(String args[]){
  int i,fact=1;
  int number=7;// our number to do the necessary calculations in class Factorial
  for(i=1;i<=number;i++)
  {
      fact=fact*i;
  }
  System.out.println("Factorial of "+number+" is: "+fact);
 }
}