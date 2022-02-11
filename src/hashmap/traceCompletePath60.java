package hashmap;

import java.util.HashMap;
import java.util.Map;

public class traceCompletePath60 {


	public static String trace(Map<String, String> map ) {
		Map<String, String> reverse = new HashMap<String, String>();
		
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			reverse.put(entry.getValue(), entry.getKey());
		}
		String from ="";
		int count = 0;
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			if(!reverse.containsKey(entry.getKey())) {
				count++;
				from=entry.getKey();
			}
					
		}
		if(count>1)
			return null;
		
		String result ="";
		String to = map.get(from);
		
		while (to!=null)
		{
			 result += from +"->" + to + ",";
			 from = to;
			 to = map.get(from);
			 
			
		}
		
		
		return result;

	}

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("NewYork", "chicago");
		map.put("Bostan", "texas");
		map.put("missouri", "NewYork");
		map.put("texas", "missouri");
	

		String result = traceCompletePath60.trace(map);
		System.out.println(result);

	}

}
