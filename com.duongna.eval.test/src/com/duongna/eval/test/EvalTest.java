package com.duongna.eval.test;

import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import com.duongna.eval.api.Eval;

/**
 * 
 */

public class EvalTest {

    private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    
    /*
     * 
     */
    @Test
    public void testEval() throws Exception {
    	Eval eval = getService(Eval.class);
    	Assert.assertNotNull(eval);
    	double res = eval.eval("1 + 2");
    	Assert.assertEquals(3.0, res, 0);
    }
    
    <T> T getService(Class<T> clazz) throws InterruptedException {
    	ServiceTracker<T,T> st = new ServiceTracker<>(context, clazz, null);
    	st.open();
    	return st.waitForService(1000);
    }
}
