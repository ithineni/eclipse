package runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			System.out.println(calculateYearsWithLowerPopulation());	
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
	public static List<String> calculateYearsWithLowerPopulation() {
	    List<String> input = new ArrayList<String>();
	    Map<String, Integer> popAlpha = new HashMap<>();
	
		    input.add("1902:1991");
		    input.add("1941:1978");
		    input.add("2004:");
		    input.add("1957:");
		    input.add("1989:2008");
		    input.add("1909:2005");
		    input.add("1918:");
		    input.add("1913:2010");
		    input.add("1979:");
		    input.add("1961:2002");
		    input.add("1977:2003");
		    input.add("1909:1991");

		    for(String record:input) {
		        String split[] = record.split(":");
		        System.out.println(split.length);
		        System.out.println(record);
		        if (split.length == 0 || split.length > 2) continue;

		        String born = split[0];

		        // Born
		        if(popAlpha.get(born) != null) {
		        	popAlpha.put(born, 0);
		        }
		        else {
		        	//System.out.println(popAlpha.get(born).intValue() + 1);
		        	popAlpha.put(born,popAlpha.get(born).intValue() + 1);
		        	
		        }

		        if (split.length != 2) continue;
		        String died = split[1];

		        // Died
		        if(popAlpha.get(died) != null) {
		        	popAlpha.put(died, 0);
		        }
		        else {
		        	//System.out.println(popAlpha.get(died).intValue() - 1);
		        	popAlpha.put(died,popAlpha.get(died).intValue() - 1);
		        }
		    }

		    return popAlpha.entrySet()
		                          .stream()
		                          .filter(entry -> entry.getValue().intValue() < 0)
		                          .map(Entry::getKey)
		                          .collect(Collectors.toList());
}
}

