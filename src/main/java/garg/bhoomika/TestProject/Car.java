package garg.bhoomika.TestProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Type type;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void drive()
	{
		System.out.println("Moving "+type);
	}
	

}
