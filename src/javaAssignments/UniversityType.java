package javaAssignments;

import java.util.ArrayList;

public class UniversityType {

	public static void main(String[] args) {
		
		ArrayList <String> DelhiUniCourses= new ArrayList <String> ();
		
		DelhiUniCourses.add("Algorithm");
		DelhiUniCourses.add("Digital");
		DelhiUniCourses.add("E-comm");
		DelhiUniCourses.add("Reconfigurable");
		DelhiUniCourses.add("Networking");
		DelhiUniCourses.add("National security");
		// TODO Auto-generated method stub
//		University u1=new University("Delhi University","India");
//		System.out.println(u1.getName());
//		System.out.println(u1.getcountry());
//		
//		University u2=new University("Delhi University",05.1942);
//		System.out.println(u2.getName());
//		System.out.println(u2.getEstablishedDate());
//		
//		University u3=new University("Delhi University","India",05.1942);
//		System.out.println(u3.getName());
//		System.out.println(u3.getcountry());
//		System.out.println(u3.getEstablishedDate());
		
		University u1=new University("Delhi University","Delhi",DelhiUniCourses);
		System.out.println(u1.getName());
		System.out.println(u1.getHq());
		System.out.println(u1.getCourses());
		
		
		
        u1.setHq("pune");
        System.out.println(u1.getName()+""+u1.getHq());
	
	
    
	
    
    	
//    	for(String c:Courses) {
//    		System.out.println(c);
//    		
    		
    		//System.out.println(u1.getName()+u1.getcountry()+u1.getEstablishedDate());
    	}
}
	

