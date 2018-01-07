package test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.MyArrayStack;
import common.MyArrayStackEx;


public class MyArrayStackExTest {
	public void testPopObject() {
		MyArrayStackEx list = new MyArrayStackEx();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		list.add(i1);
		list.add(i2);
		//list.pop(0);
		assertEquals(2,list.size());
	}

}