package day5b;

public class Employee {

	int id;
	String name;
	double salary;
	int depId;
	String title;
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(depId);
		System.out.println(title);
		
	}
	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		emp1.id=101;
		emp1.name= "David";
		emp1.salary=50000.00;
		emp1.title= "manager";
		emp1.depId= 4;
		
		emp1.display();		
	}

}
