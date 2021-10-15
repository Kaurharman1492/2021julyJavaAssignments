package ConditionalOperator;

public class CondOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i=25;
   int j=78;
   int k=87;
   
   
   if(i>j) {
	   System.out.println("i is the greatest number"); 
   }
	   else if(j>k) {
		   System.out.println("j is the greatest number");    
	   }
	   else {
		   System.out.println("k is the greatest number");    
	   }
   
   int p=35;
   int o=-11;
   
   String output="p";
   
   
   if(output.equals("p")) {
	   System.out.println("positive number");
	   }
 
  else if(output.equals("o")) {
	   System.out.println("negative number");
   }
  else {
	  System.out.println("pass the right number");
  }
   }
	

   

}
