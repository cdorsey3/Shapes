package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

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
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void TestGetArea(){
		Triangle T = new Triangle(3.0,4.0,5.0);
		double bActualArea = T.getArea();
		double bExpectedArea = 6.0;
	}
	@Test
	public void TestGetArea2(){
		Triangle T = new Triangle(6.0,8.0,10.0);
		double bActualArea = T.getArea();
		double bExpectedArea = 24.0;
	}
	@Test
	public void TestGetPerimeter(){
		Triangle T = new Triangle(6.0,8.0,10.0);
		double bActualperimeter = T.getPerimeter();
		double bExpectedperimeter = 24.0;
		
	}
	@Test
	public void TestGetPerimeter2(){
		Triangle T = new Triangle(3.0,4.0,5.0);
		double bActualArea = T.getArea();
		double bExpectedArea = 12.0;
		
	}

}
