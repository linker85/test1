package com.example.com.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by raul on 09/11/2016.
 */

public class BalancerUnitTest {

    BalancerMagic balancerMagic;

    @Before
    public void setup() {
        balancerMagic = new BalancerMagic();
    }

    @Test
    public void balancerIsCorrectBalanced () {
        assertTrue(balancerMagic.isBalanced("{}()"));
        assertTrue(balancerMagic.isBalanced("[{()}]"));
        assertTrue(balancerMagic.isBalanced("({()})"));
    }

    @Test
    public void balancerIsCorrectUnBalanced () {
        assertFalse(balancerMagic.isBalanced("[["));
        assertFalse(balancerMagic.isBalanced("{}("));
        //assertFalse(balancerMagic.isBalanced("[[])"));
    }

    @After
    public void cleanUp() {
        balancerMagic = null;
    }


}
