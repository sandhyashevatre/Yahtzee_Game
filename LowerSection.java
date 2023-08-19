package Day8_26;

import java.util.*;


public class LowerSection {
		
		List <Integer> dieAsList;
		private int sum;
		
		public LowerSection(List <Die> die) {
			
			int sum = 0;
			ArrayList<Integer> dieAsList = new ArrayList<>();
			
			for(Die d : die) {
				dieAsList.add(d.show());
				sum += d.show();
			}
			
			this.dieAsList = dieAsList;
			this.sum = sum;
			
		}
		
		public int scoreOfThreeKind() {
			
			System.out.print("Score of Three Of A Kind : ");
			
			for(int i = 1 ; i < 7 ; i++) {
				int count = Collections.frequency(this.dieAsList,i);
					if (count == 3)
						return (this.sum);
			}
			
			return 0;
			
		}
		
		public int scoreOfFourKind() {
			
			System.out.print("Score of Four Of A Kind : ");
			
			for(int i = 1 ; i < 7 ; i++) {
				int count = Collections.frequency(this.dieAsList,i);
					if (count == 4)
						return (this.sum);
			}
			
			return 0;
			
		}
		
		public int scoreOfFullHouse() {
			
			System.out.print("Score Of Full House : ");
			ArrayList<Integer> frequencyList = new ArrayList<>();
			
			for(int i = 1 ; i < 7 ; i++) {
				int count = Collections.frequency(this.dieAsList,i);
				frequencyList.add(count);
			}
			
				if(frequencyList.contains(3) && frequencyList.contains(2))
					return 25;
				
			return 0;
		}
		
		public int scoreOfYahtzee() {
			System.out.print("Score of Yahtzee : ");
			for(int i = 1 ; i < 7 ; i++) {
				int count = Collections.frequency(this.dieAsList,i);
					if (count == 5)
						return 50;
			}
			return 0;
		}
		
		public int scoreOfChance() {
			System.out.print("Score of Chance : ");
			return this.sum;
		}

	}
	
