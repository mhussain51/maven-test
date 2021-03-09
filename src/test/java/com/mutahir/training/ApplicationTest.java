package com.mutahir.training;

import org.junit.Test; //@Test
import static org.junit.Assert.*; //assertTrue()

public class ApplicationTest {
    
    @Test
	public void test1(){
		assertTrue(true);
	}
	
	@Test
	public void test2(){
		assertTrue(2 == 2);
	}
	
	@Test
	public void test3(){
		assertTrue("abc".length() == 3);
	}
}