package constructor;

class Student{
	int id;
	String name;
	Student(int i, String n){
		id=i;
		name = n;
	}
	void display(){
		System.out.println(id+" "+name);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student std1=new Student(1,"Abcdefgh");
		Student std2=new Student(10,"ijklmnop");
		std1.display();
		std2.display();
		
		
	}

}
