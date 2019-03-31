/*
 * AUTHOR: ERIN GROOMS
 * DUE DATE: 03-30-2019
 */
public class MesoAscii extends MesoAsciiAbstract{
	
	/*
	 * get the four letters from MesoStation.java
	 * 
	 */
	MesoStation StID;
	public MesoAscii(MesoStation letters) {
		StID = letters;
	}
	
	/*
	 * Get the station ID (input value) from Main.java
	 * The station ID is store in MesoStation.java
	 * Calculate the average values of the four letters
	 * Return the average value
	 * @see MesoAsciiAbstract
	 */

	public int calAverage() {
		
		int letterValue = 0;
		double sum = 0.0;
		
		for(int i = 0; i < 4; ++i) {
			letterValue = (int) StID.getStID().charAt(i);
			sum = sum + letterValue;
		}
		
		double avgNum = sum / 4;
		
		int value = (int) Math.round(avgNum);
		
		return value;
	}

}
