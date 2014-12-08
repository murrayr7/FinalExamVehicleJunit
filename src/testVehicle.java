import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.JUnit4;


public class testVehicle {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultipleOwnership() {
		Person a = new Person();
		Car car = new Car();
		car.transferOwnership(a);
		car.setNumberOfDoors(4);
		
		Truck truck = new Truck();
		truck.transferOwnership(a);
		truck.setNumberOfAxels(2);
		
		assertEquals(car.getOwner(),truck.getOwner());
	}
	
	@Test
	public void testTransferOwnership() {
		Person a = new Person();
		
		Truck truck = new Truck();
		truck.transferOwnership(a);
		truck.setNumberOfAxels(2);
		
		Person b= new Person();
		truck.transferOwnership(b);
		
		assertEquals(truck.getOwner(), b);
		
	}

}
