package proj;

class Counter{
	static int count;
	
	public Counter(){
		count=0;
	}
}

public class Test3 {
	
	
	public static void main(String[] args) {
		
		String str ="abcd";
		
		func(str, str.length());
		
		
		Counter counter = new Counter();
//		recursive(str, counter);
	}
	
	
//	static void recursive(String str, Counter counter){
//		if(Counter.count >str.length()) return;
//		
//		else{
//			
////			for(int i=0; i<str.length();i++){
//				System.out.println(str.substring(counter.count++));
//				recursive(str,counter );
////			}
////				
//			
//			
//		}
//		
//		
//	}

	
	static void func(String s, int count){
		
		for(int i=0; i<s.length(); i++){
			for(int j=i+1; j<=count; j++){
				System.out.println(s.substring(i,j));
			}
		}
	}
	
	
}
