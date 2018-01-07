package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.MyArrayStack;

public class MyArrayStackTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmpty() {
		MyArrayStack list = new MyArrayStack();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		assertEquals(2,list.size());
	}

	@Test
	public void testPop() {
		MyArrayStack list = new MyArrayStack();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		//list.pop(0);
		assertEquals(2,list.size());
		
	}

	@Test
	public void testPush() {
		MyArrayStack list = new MyArrayStack();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		assertEquals(2,list.size());
		//fail("Not yet implemented");
	}

}
