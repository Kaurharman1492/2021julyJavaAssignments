package javaAssignments;

public class Employeeinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setName("Mandeep");
		obj.setAge(30);
		obj.setSalary(12.55);
		obj.setActive(true);
		obj.setGender('f');
		
		Employee obj1=new Employee();
		obj1.setName("Harsimrat");
		obj1.setAge(25);
		obj1.setSalary(10.55);
		obj1.setActive(true);
		obj1.setGender('m');
		
		Employee obj2=new Employee();
		obj2.setName("Kirat");
		obj2.setAge(26);
		obj2.setSalary(14.55);
		obj2.setActive(false);
		obj2.setGender('m');
		

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		System.out.println(obj.isActive());
		System.out.println(obj.getGender());
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getSalary());
		System.out.println(obj1.isActive());
		System.out.println(obj1.getGender());
		
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		System.out.println(obj2.getSalary());
		System.out.println(obj2.isActive());
		System.out.println(obj2.getGender());
		
  String info=obj.getEmployeeinfo();
  System.out.println(info);
	
		
	}

}
