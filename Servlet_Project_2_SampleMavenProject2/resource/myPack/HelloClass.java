package myPack;

public class HelloClass {
	
	private String name;
	
	public void printHello()
	{
		System.out.println("Hello world from "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
