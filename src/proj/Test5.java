package proj;

public class Test5 {

	
	
	
	public static void replaceString(String s, char replaceThis, char withThis)
	{
		char[] ch = s.toCharArray();
		
		for(int i=0; i < s.length(); i++){
			if(ch[i] == replaceThis){
				ch[i] = withThis;
			}
		}
		System.out.println(new String(ch));
	}
	
	
	public static void main(String[] args) {
		replaceString("I am in an interview", 'i', 'x');
	}
}
