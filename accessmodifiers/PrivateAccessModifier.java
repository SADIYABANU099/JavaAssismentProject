package accessmodifiers;

class PrivateModifier{
	private void display() {
		System.out.println("You are using private access specifier");
	}
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		System.out.println("Private Access Modifier");
		PrivateModifier p = new PrivateModifier();
		//p.display();
		

	}

}
