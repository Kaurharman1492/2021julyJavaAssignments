package OOP_HospitalManagementSystem;

public class TestHospital {

	public static void main(String[] args) {
		
		Apollo a=new Apollo();
		a.General();
		a.Dentistry();
		a.Gyncology();
		a.getName();
		System.out.println(a.patient_fee);
		
		Max m=new Max();
		m.General();
		m.Orthopedics();
		m.Eye();
		m.getName();
		System.out.println(m.patient_fee);
		
		
		Fortis f=new Fortis();
		f.Gyncology();
		f.Orthopedics();
		f.Emergency();
		f.getName();
		
		
	
		
		System.out.println(f.patient_fee);

		
		Hospital h=new Apollo();
		h.Orthopedics();
		h.General();
		h.Gyncology();
		
//		Apollo a1=(Apollo) new Hospital();
//		a1.Dentistry();
//		a1.Gyncology();
//		a1.General();
//		
		
	}

}
