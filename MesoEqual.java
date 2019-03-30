import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEqual {
	
	HashMap<String, Integer> stid = new HashMap<String, Integer>();
	
	ArrayList<String> stIDList = new ArrayList<String>();
	
	String letters;
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
	public HashMap<String, Integer> calAsciiEqual() {
		for(String stID : stid.keySet()) {
			
			if(stid.get(stID).equals(stid.values())){
				
			}
		}
		return null;
	}

}
