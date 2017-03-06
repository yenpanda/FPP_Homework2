package Recursive;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog4Test {

	@Test
	public void test() {
		boolean in = Prog4.recur("abcba");
		boolean out = true;
		assertEquals(in,out);
	}

}
