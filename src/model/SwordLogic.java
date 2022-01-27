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
//Calculate type of sword by length and weight
public class SwordLogic {
	String type;
	public String calculateSwordType(Swordsman swordsman) {
		int swordLength = 0;
		swordLength = swordsman.getSwordLength();
		if (swordLength > 4) {
			type = "2hd";
	    } else {
	    	type = "1hd";
	    }
		return type;
	}
	
	public boolean boardAndSword(Swordsman board) {
		int swordWeight = 0;
		swordWeight = board.getSwordWeight();
		if (swordWeight >= 30) {
			return false;
		} else {
			return true;
		}
	}
			

}
