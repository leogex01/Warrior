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
//Calculate type of sword by length 
public class SwordLogic {
	String type;
	public String calculateSwordType(Swordsman swordsman) {
		int swordLength = 0;
		swordLength = swordsman.getSwordLength();   
		if (swordLength > 4) {      //determine sword handling using sword length
			type = "2hd";
	    } else {
	    	type = "1hd";
	    }
		return type;
	}
	
	//use a shield or not, depending on swords weight
	public boolean boardAndSword(Swordsman board) {
		int swordWeight = 0;
		swordWeight = board.getSwordWeight(); //any sword over 29 lbs means no shield
		if (swordWeight >= 30) { //returns boolean value
			return false;
		} else {
			return true;
		}
	}
			

}
