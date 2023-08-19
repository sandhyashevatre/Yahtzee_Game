package Day8_26;

import java.util.*;

public class Yahtzee {
	
    public static void main(String[] args) {
    	Die d1 = new Die();
		Die d2 = new Die();
		Die d3 = new Die();
		Die d4 = new Die();
		Die d5 = new Die();
		Die[] diceArr = {d1, d2, d3, d4, d5};
		List<Die> dice = Arrays.asList(diceArr);
		d1.set(2);
		d2.set(3);
		d3.set(4);
		d4.set(5);
		d5.set(6);
		
		UpperSection us=new UpperSection(dice);
		System.out.println(us.score(1));
		System.out.println(us.score(2));
		System.out.println(us.score(3));
		System.out.println(us.score(4));
		System.out.println(us.score(5));
		System.out.println(us.score(6));
		
		LowerSection ls = new LowerSection(dice);
		System.out.println(ls.scoreOfThreeKind());
		System.out.println(ls.scoreOfFourKind());
		System.out.println(ls.scoreOfFullHouse());
		System.out.println(ls.scoreOfYahtzee());
		System.out.println(ls.scoreOfChance());
		
		
		Straight small = new Straight(4);
		Straight large = new Straight(5);
		System.out.println(small.score(dice));
		System.out.println(large.score(dice));
		
    }
}