package javaAssignments;

public class TestBrowser {

	public static void main(String[] args) {
		

		
		String [] plugins=new String[6];
		plugins[0]="Flash";
		plugins[1]="component list";
		plugins[2]="hep info";
		plugins[3]="control current site settings";
		plugins[4]="adblock plus";
		plugins[5]="privacy badger";
		
		
		Browser b1=new Browser("chrome",91.11,plugins);
		System.out.println(b1.getName()+b1.getVersion()+plugins[2]+plugins[1]+plugins[0]);
		
	    Browser b2=new Browser("firefox", 73.2,plugins);
	    System.out.println(b2.getName()+b2.getVersion()+plugins[4]+plugins[5]);
	
	
	    Browser b3=new Browser("IE", 11.0,plugins);
	    System.out.println(b3.getName()+b3.getVersion()+plugins[3]);
		
		
	}

}
