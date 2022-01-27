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

public class SwordLogicTest {
	SwordLogic swLogic = new SwordLogic(); 
	Swordsman swMan = new Swordsman();	
	
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateSwordTypeTrue() {
		swMan.setSwordLength(10); //set sword length
		String type = swLogic.calculateSwordType(swMan); // set variable to correct class & method
		assertEquals("2hd", type); //should return 2hd
	}
	
	@Test
	public void testCalculateSwordTypeFalse() {
		swMan.setSwordLength(10); //set sword length
		String type = swLogic.calculateSwordType(swMan); 
		assertNotEquals("1hd", type);   // should return false
	}
     
	
}
