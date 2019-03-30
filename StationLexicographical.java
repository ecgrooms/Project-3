import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StationLexicographical extends MesoSortedAbstract{
	
	
	@Override
	public HashMap<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
		HashMap<String, Integer> sMap = new HashMap<String, Integer>(unsorted);
		unsorted.putAll(sMap);
		
		return sMap;
	}
	
	public StationLexicographical(HashMap<String, Integer> value) {
		
		for (String stid : value.keySet()) {
			
			System.out.println(stid + " " + value.get(stid));
			
		}
	
	}
	
	public HashMap<String, Integer> inOrderedMap(HashMap<String, Integer> sorted){
		
		Map<? extends String, ? extends Integer> sMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		
		sorted.putAll(sMap);
		
		
		return (HashMap<String, Integer>) sMap;
	}

}
