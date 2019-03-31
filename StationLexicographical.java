/*
 * AUTHOR: ERIN GROOMS
 * DUE DATE: 03-30-2019
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StationLexicographical extends MesoSortedAbstract{
	
	//A map that sorted the list of station IDs and their values
	TreeMap<String, Integer> sMap = new TreeMap<>();
	
	//sort the list and return the whole lists of station IDs and values
	public Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
		sMap.putAll(unsorted);
		
		return sMap;
	}
	
	public StationLexicographical(HashMap<String, Integer> value) {
		
		sortedMap(value);
		
		for (String stid : sMap.keySet()) {
			
			System.out.println(stid + " " + value.get(stid));
			
		}
	
	}

}
