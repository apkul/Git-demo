package pkg1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

public class Test1 {

	
	public static void main(String[] args) {
		
		
//		WebElement table = driver.findWlements(By.xpath("//table[@class='table table-sm sidebar-widget-table text-center mb-0']")));
		
//		List<WebElement> row = driver.findWlements(By.xpath("//table[@class='table table-sm sidebar-widget-table text-center mb-0']/tbody/tr"));
		
		
		String str = "adajsdgr sadfd add add";
		
		String[] strWords = str.split(" ");
		
		Map<String, Integer> mp = new HashMap<>();
		
		for(String string : strWords){
			if(mp.containsKey(string)){
				int value = mp.get(string);
				mp.put(string, value+1);
			}else{
				mp.put(string, 1);
			}
		}
		
		System.out.println(mp);
		
		Set<Map.Entry<String, Integer> > set = mp.entrySet();
		
		
		
		for(Map.Entry<String, Integer> entry : set){
			System.out.println("Word: "+entry.getKey() +" Value: "+entry.getValue());
		}
		
		
		mp.entrySet().iterator();
	}
}
