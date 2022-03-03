package constructor;

class EmpInformtion{
	int id;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}
}


public class DefaultConstructor {
	public static void main(String[] args) {
		EmpInformtion emp1= new EmpInformtion();
		EmpInformtion emp2= new EmpInformtion();
		emp1.display();
		emp2.display();
		
		
	}

}
