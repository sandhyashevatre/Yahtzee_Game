package Day8_26;

import java.util.*;

public class UpperSection {
	
	List<Die> die;
	private static String[] nums = {" ","Aces","Twos","Threes","Fours","Fives","Sixes"};
	
	public UpperSection(List<Die> die) {
		this.die = die;
	}
	
	public String score(int givenValue) {
		
		ArrayList<Integer> dieAsList = new ArrayList<>();
		
		for(Die d : this.die) {
			dieAsList.add(d.show());
		}
		
		int count = Collections.frequency(dieAsList, givenValue);
		return "Score of "+nums[givenValue]+" : "+(count*givenValue);
		
	}
	
}
