import java.util.HashMap;
import java.util.Map;

public class StationLexicographical extends MesoSortedAbstract{
	
	
	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public StationLexicographical(HashMap<String, Integer> value) {
		
		for (String stid : value.keySet()) {
			
			System.out.println(stid + " " + value.get(stid));
			
		}
	
	}

}
