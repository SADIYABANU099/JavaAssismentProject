package accessmodifiers;


class defaultmodifier
{
	 void display()
	{
		System.out.println("Yoy are using defalut access specifier");
	}
}


public class DefaultAccessModifier {

	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defaultmodifier obj = new defaultmodifier();
		obj.display();
		

	}

}
