package JavaPractice;

public class PojoClass {
	
	private String name;
	private String standard;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}

	public static void main(String[] agrs) {
		PojoClass pojo = new PojoClass();
		pojo.setName("Sreenivas");
		String name = pojo.getName();
		System.out.println(name);
	}
}
