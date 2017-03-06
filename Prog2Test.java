package Recursive;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog2Test {

	@Test
	public void test() {
		char in = Prog2.Rec("akel");
		char out = 'a';
		assertEquals(in,out);
		
	}

}
