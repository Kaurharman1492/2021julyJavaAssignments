package javaAssignments;

import java.util.ArrayList;

public class University {
	
	  private String name;
	  private String hq;
	  private ArrayList <String> Courses;
//	  private String country;
//	  private Double EstablishedDate;
//		
//		
//  public University(String name,String country) {
//	  this.name=name;
//	  this.country=country;
//	  
//	  
//  }
//  public University (String name,Double EstablishedDate) {
//	  this.name=name;
//	  this.EstablishedDate=EstablishedDate;
//	  
//}
//  public University (String name,String country,Double EstablishedDate) {
//	  this.name=name;
//	  this.country=country;
//	  this.EstablishedDate=EstablishedDate;
//}   
//  
//  public String getName(){
//	  
//	 return name;
//  }
//  
//  public String getcountry() {
//	  return country;
//	  
//  }
//  public Double getEstablishedDate() {
//	  return EstablishedDate;
	public University(String name, String hq) {
		
		this.name = name;
		this.hq = hq;
	}

public University(String name, String hq, ArrayList<String> courses) {
	
	this.name = name;
	this.hq = hq;
	Courses = courses;
}
public University(String hq, ArrayList<String> courses) {
	
	this.hq = hq;
	Courses = courses;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHq() {
	return hq;
}
public void setHq(String hq) {
	this.hq = hq;
}
public ArrayList<String> getCourses() {
	return Courses;
}
public void setCourses(ArrayList<String> courses) {
	Courses = courses;
}
	 
	  
	  
  }

