
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
	@Override
	public int calAverage() {
		
		int letterValue;
		int sum = 0;
		
		for(int i = 0; i < 4; ++i) {
			letterValue = (int) StID.getStID().charAt(i);		//Use getStID() instead of toString() to get the correct value
			sum = sum + letterValue;
		}
		
		int avgNum = sum / 4;
		
		int value = Math.round(avgNum);
		
		return value;
	}

}
