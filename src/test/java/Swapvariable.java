
public class Swapvariable {

	
	public void getswap(int a, int b) {
		  
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println(a);
		System.out.println(b);
	
	}
	
	
	
	public static void main(String[] args) {
		
		Swapvariable obj = new Swapvariable ();
		obj.getswap(5, 10);
		
	}
	
}
