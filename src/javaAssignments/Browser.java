package javaAssignments;

public class Browser {
	
	private String name;
	private Double version;
	private String Plugins[];
	
//	public Browser(String name, Double version) {
//		
//		this.name = name;
//		this.version = version;
//		
//	}
//	
//public Browser(String name, String Plugins[]) {
//		
//		this.name = name;
//		this.Plugins = Plugins;
//		
//	}

public Browser(String name, Double version,String Plugins[]) {
		
		this.name = name;
		this.version = version;
		this.Plugins = Plugins;
}
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public String[] getPlugins() {
		return Plugins;
	}

	public void setPlugins(String[] Plugins) {
		this.Plugins = Plugins;
	}
	
	
	
	
	

}
