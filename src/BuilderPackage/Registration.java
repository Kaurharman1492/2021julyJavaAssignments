package BuilderPackage;



public class Registration {
	
	String FirstName;
	String LastName;
	String Email;
	Long phno;
	String city;
	String country;
	String address;
	int Age;
	
	public String getFirstName() {
		return FirstName;
	}
	public Registration(String firstName, String lastName, String email, Long phno, String city, String country,
		String address, int age) {
		
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		this.phno = phno;
		this.city = city;
		this.country = country;
		this.address = address;
		Age = age;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void HomeAddress(Registration registration) {
		
	    Registration r=registration;
		System.out.println("register with :"+r.getFirstName()+" "+r.getLastName()+" "+r.getEmail()+" "+r.getPhno()+" "+
				r.getCity()+" "+r.getCountry()+" "+r.getAddress()+" "+r.getAge());
	}
	
	
	
}