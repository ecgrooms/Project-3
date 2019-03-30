import java.util.HashMap;
import java.util.Map;

public class StationLexicographical extends MesoSortedAbstract{
	
	
	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
		HashMap<String, Integer> sMap = new HashMap<String, Integer>(unsorted);
		sMap = (HashMap<String, Integer>) unsorted.entrySet();
		
		return sMap;
	}
	
	public StationLexicographical(HashMap<String, Integer> value) {
		
		for (String stid : value.keySet()) {
			
			System.out.println(stid + " " + value.get(stid));
			
		}
	
	}

}
