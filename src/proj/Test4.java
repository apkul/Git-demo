package proj;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test4 {
	
	static String[] generate_all_subsets(String s) {
		List<String> list = new Vector<>();
//        List<String> list = new ArrayList<>();
//        list.add("");
        
//        for(int i=0; i<s.length(); i++){   /// runs n times
//            int oldLen = list.size();
//            for(int j=0; j<oldLen; j++){   /// runs 2^n times
//                list.add(list.get(j)+s.charAt(i));
//            }
//        }
        
        helper(list, s, 0, "");
        
        return list.toArray(new String[0]);

    }
	
	
	static void helper(List<String> list, String s, int pos, String curr){
        if(pos == s.length()){
            list.add(curr);
            return;
        }
        
        helper(list, s, pos+1, curr);
        helper(list, s, pos+1, curr+s.charAt(pos));
    }
	
	
	public static void main(String[] args){
		String s= "abcd";
		String[] str= generate_all_subsets(s);
		
		for(String string: str){
			System.out.println(string);
		}
		
	}

}
