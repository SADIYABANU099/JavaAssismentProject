package methods;

public class MethodCallByValue {
	 int val = 150;
	 int operation(int val) {
		 val = val*10/100;
		 return(val);
	 }

	public static void main(String[] args) {
		MethodCallByValue e = new MethodCallByValue();
		System.out.println("Before operation " +e.val);
		e.operation(100);
		System.out.println("After operation " +e.val);
		

	}

}
