package Day8_26;

import java.util.Random;

public class Die {
	
	private int value;
	private Random rdm;
	
	public Die() {
		this.value = 1;
		this.rdm = new Random();
	}
	
	public int show() {
		return value;
	}
	
	public void roll() {
		value = rdm.nextInt(1, 7);
	}
	
	public void set(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Die))
			return false;
		Die otherDie = (Die) other;
		return otherDie.value == this.value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}