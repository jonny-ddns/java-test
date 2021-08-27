package java_basic01.j20210208_delegation;

public class Manager{
	
	Employee employee = new Employee();
	
	public void echo() {
		employee.echo();
	}
}
