/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Jan 27, 2022
 */
package model;

/**
 * @author chrisg
 *
 */
public class Swordsman {
	private int swordLength;
	private int swordWeight;
	private String shield;
	
	
	public Swordsman() {
		super();
	}


	public Swordsman(int swordLength, int swordWeight, String shield) {
		super();
		this.swordLength = swordLength;
		this.swordWeight = swordWeight;
		this.shield = shield;
	}


	public int getSwordLength() {
		return swordLength;
	}


	public void setSwordLength(int swordLength) {
		this.swordLength = swordLength;
	}


	public int getSwordWeight() {
		return swordWeight;
	}


	public void setSwordWeight(int swordWeight) {
		this.swordWeight = swordWeight;
	}


	public String getShield() {
		return shield;
	}


	public void setShield(String shield) {
		this.shield = shield;
	}
}
