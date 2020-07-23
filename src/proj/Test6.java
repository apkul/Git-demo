package proj;

class Test6 {
	
	
	

	
	public static String stringReverse(String s){
		String str ="";
		for(int i = s.length()-1; i>=0; i--){
			str+=s.charAt(i); 
		}
		return str;
		
	}
	
	public static void main(String[] args) {	
		
		System.out.print(stringReverse("reverse"));
	}
}
