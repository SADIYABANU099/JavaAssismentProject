package methods;

public class MethodExecution {
	
	public int multipynumbers(int a, int b) {
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		MethodExecution h = new MethodExecution();
		int ans = h.multipynumbers(2,3);
		System.out.println("Multiplication is: "+ans);
		

	}

}
