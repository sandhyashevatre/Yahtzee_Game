package Day8_26;
import java.util.*;

public class Straight {
	
	private int str_length;
	
	private static String[] small_str = {"1234","2345","3456"};
	private static String[] large_str = {"12345","23456"};
	
	public Straight(int str_length) {
		if(!(str_length == 4 || str_length == 5)) {
			str_length = 0;
		}
		this.str_length = str_length;
	}
	public static boolean contains(StringBuilder sb, String findString){
	    return sb.indexOf(findString) > -1;
	}
	
	 public int score(List<Die> die) {
		 
		 StringBuilder sb = new StringBuilder("");
		 
		 for(Die d : die) {
			 if(!contains(sb,d.toString()))
				sb.append(d.toString());
		 }
		 
		 char[] tempchar=sb.toString().toCharArray();
		 Arrays.sort(tempchar);
		 String dieAsString = new String(tempchar);
		 
		 if (str_length == 5) {
			 System.out.print("Score of Large Straight : ");
			 for (String possibility : large_str)
				if (dieAsString.equals(possibility))
					return 40;
		}else if(str_length == 4){
			System.out.print("Score of Small Straight : ");
			for (String possibility : small_str) {
				if (dieAsString.substring(0,4).equals(possibility) || dieAsString.substring(1).equals(possibility))
					return 30;
				}
		}
		 
		 return 0;
		 
	 }
	 
}
