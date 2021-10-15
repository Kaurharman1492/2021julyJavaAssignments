package javaAssignments;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<String>();
		
		
		color.add("white");
		color.add("red");
		color.add("pink");
		color.add("brown");
		color.add("black");
		color.add("violet");
		color.add("green");
		
		System.out.println(color.get(2)+" "+color.get(5));
		
		int j=color.size();
	    System.out.println(j);
		
		color.trimToSize();
		//color.get(9);
		System.out.println("color");
		
		for(Object e:color) {
		System.out.println(e);
		
		}
		
		
		ArrayList<String> Element=new ArrayList<String>();
		
	  Element.add("Calcium");
	  Element.add("sodium");
	  Element.add(Element.size(),"iron");
	  Element.add(Element.size()-Element.size(),"vitamin");

	  
	  System.out.println(Element);
	  
	  
	  ArrayList<String> Names=new ArrayList<String>();
	  
	  Names.add("manisha");
	  Names.add("mansie");
	  Names.add("raveena");
	  Names.add("sumit");
	  
	  System.out.println(Names.get(2));
	  

	  Names.add(2,"satish");
	  
	  System.out.println(Names);
	  
	  
	  Names.remove(3);
	  System.out.println(Names);
	  
   System.out.println(Names.get(1));
   
    Collections.reverse(Names);   
    
    ArrayList<String> SomeName=new ArrayList<String>();
    SomeName.add("raveena");
    SomeName.add("sumit");
    
    Names.removeAll(SomeName);
    System.out.println(Names);
    
//    Names.clear();
//    System.out.println(Names);
    
    
    Collections.swap(Names, 0, 2);
    System.out.println(Names);
    
	}
	}
	

	


