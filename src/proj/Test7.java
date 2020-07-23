package proj;

public class Test7 {

	
	

	public static void main(String[] args) {
		
		printPattern_RightAngledTriangle(5, '*');
		
		
	}
	
	
	
	
	public static void printPattern_RightAngledTriangle(int n, char c) {
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void printPattern_trapezium() {
		
		
//		*
//	   * *
//	  * * *
//	 * * * *
		
		
		
	}
	
}
