package com.duongna.eval.api;

/**
 * A service that evaluate an expression string
 */
public interface Eval {
	
	/**
	 * Evaluate an expression string
	 */
	double eval(String expression) throws Exception;
	
}
