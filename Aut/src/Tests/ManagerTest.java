package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Model.Manager;

public class ManagerTest {


	Manager m1,m2;
	//@Before
	public void setUp() throws Exception {

		m1 = new Manager("Ivan", " Paul", "O'Brien", "ivan@mycit.ie", "12345775", 5);
		m2 = new Manager("Hamza", " joe", "Asif", "hamza@mycit.ie", "3264184", 5);

	}

	//@Test
	public void test() {
		assertTrue("Cannot be null", (m1.getFirstName()!=null));
		assertTrue("Cannot be null", (m2.getFirstName()!=null));

		assertTrue("Can be blank or filled", ((m1.getMiddleName()) == null ||(m1.getMiddleName()) !=null));
		assertTrue("Can be blank or filled", ((m2.getMiddleName()) == null ||(m2.getMiddleName()) !=null));

		assertTrue("Cannot be null", (m1.getLastName())!=null);
		assertTrue("Cannot be null", (m2.getLastName())!=null);

		assertTrue("Cannot be null", (m1.getEmail())!=null);		
		assertTrue("Cannot be null", (m2.getEmail())!=null);

		assertTrue("Cannot be null", (m1.getPhone())!=null);
		assertTrue("Cannot be null", (m2.getPhone())!=null);

		assertTrue("Cannot be null", (m1.getStarRating())!=null);
		assertTrue("Cannot be null", (m2.getStarRating())!=null);
	}

	private void assertTrue(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

}