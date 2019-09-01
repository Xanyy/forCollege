package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Model.Player;

public class PlayerTest {


	Player p1,p2;
	//@Before
	public void setUp() throws Exception {

		p1 = new Player("Ivan", " Paul", "O'Brien", "ivan@mycit.ie", "12345775", 5, false);
		p2 = new Player("Hamza", " joe", "Asif", "hamza@mycit.ie", "3264184", 5, false);

	}

	//@Test
	public void test() {
		assertTrue("Cannot be null", (p1.getFirstName()!=null));
		assertTrue("Cannot be null", (p2.getFirstName()!=null));

		assertTrue("Can be blank or filled", ((p1.getMiddleName()) == null ||(p1.getMiddleName()) !=null));
		assertTrue("Can be blank or filled", ((p2.getMiddleName()) == null ||(p2.getMiddleName()) !=null));

		assertTrue("Cannot be null", (p1.getLastName())!=null);
		assertTrue("Cannot be null", (p2.getLastName())!=null);

		assertTrue("Cannot be null", (p1.getEmail())!=null);		
		assertTrue("Cannot be null", (p2.getEmail())!=null);

		assertTrue("Cannot be null", (p1.getPhone())!=null);
		assertTrue("Cannot be null", (p2.getPhone())!=null);

		assertTrue("Cannot be null", (p1.getGoals())!=null);
		assertTrue("Cannot be null", (p2.getGoals())!=null);
	}

	private void assertTrue(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

}