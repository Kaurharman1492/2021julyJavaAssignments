package MultilevelInheritance;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Audi a=new Audi();
		a.battery();
		a.auto_parking();
		a.Diesel_mechanics();
		a.diagnose();
		a.refuel();
		a.start();
		System.out.println(a.wheel);
		
		
		Honda h=new Honda();
		h.Diesel_mechanics();
		h.indicator();
		h.start();
		h.stop();
		h.Repair();
		
		//Top casting
		Automobile a1=new Audi();
		a1.diagnose();
		a1.Diesel_mechanics();
		a1.Repair();
		
		
		//Down Casting
		Honda h1= (Honda)new Mechanical();
		
		h1.battery();
		h1.indicator();
		h1.auto_mechanics();
		
		
		
		
	}

}
