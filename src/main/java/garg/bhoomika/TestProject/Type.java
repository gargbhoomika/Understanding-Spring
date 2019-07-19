package garg.bhoomika.TestProject;

import org.springframework.stereotype.Component;

@Component
public class Type {
	private String brand;
	
	public Type(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Type [brand=" + brand + "]";
	}
	

}
