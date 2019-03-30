import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEqual {
	
	HashMap<String, Integer> stid = new HashMap<String, Integer>();
	
	ArrayList<String> stIDList = new ArrayList<String>();
	
	String letters;

	MesoAscii a = new MesoAscii( new MesoStation(letters));
	
	public MesoEqual(String name) {
		letters = name;
	}
	
	public void read(String filename) throws IOException
    {
		
    	// Use a buffered Reader on the file:
		filename = "Mesonet.txt";
    	BufferedReader br = new BufferedReader(new FileReader(filename));
        String letters;
        letters = br.readLine();
        letters = br.readLine();
        letters = br.readLine();
        
        while(letters != null) {
			
        	String words = letters.substring(1, 5);
			letters = br.readLine();
			stIDList.add(words);
			
		}
        
        br.close();
        
    }
	
	int value = a.calAverage();
	/* loop over each station in the list and get the value
	 * then compare to the StID, add to map if the same
	 * return the list of same value station
	 */
	public HashMap<String, Integer> calAsciiEqual() {
		
		MesoAscii b = new MesoAscii( new MesoStation(letters));

		for(String name : stIDList) {
			int v = b.calAverage();
			if(v == value){
				stid.put(name, v);
			}
		}
		return stid;
	}

}
