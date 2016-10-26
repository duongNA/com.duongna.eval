package com.duongna.eval.provider;

import junit.framework.TestCase;

public class EvalImplTest extends TestCase {
	
	public void testSimple() throws Exception {
		EvalImpl evalImpl = new EvalImpl();
		assertEquals(3.0, evalImpl.eval("1 + 2"));
	}
}
