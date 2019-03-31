import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StationLexicographical extends MesoSortedAbstract{
	
	TreeMap<String, Integer> sMap = new TreeMap<>();
	
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
