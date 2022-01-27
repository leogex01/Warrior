/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Jan 27, 2022
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.SwordLogic;
import model.Swordsman;

public class ShieldTest {
	SwordLogic swLogic = new SwordLogic(); 
	Swordsman swMan = new Swordsman();	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test 
	public void testBoardAndSwordFalse() {
		swMan.setSwordWeight(50); //set sword weight
		boolean shield = swLogic.boardAndSword(swMan); //true for use shield, false for not
		assertFalse(shield); //assertFalse 
	}
	
	@Test 
	public void testBoardAndSwordTrue() {
		swMan.setSwordWeight(20); //set sword weight
		boolean shield = swLogic.boardAndSword(swMan); //true for use shield, false for not
		assertTrue(shield); // should return True 
	}

}
