package com.allstate;
import org.junit.Test;

import static org.junit.Assert.*;


public class BrokerageTest {
    @Test
    public void testClientParms(){
        Brokerage b1 = new Brokerage("vinit");
        assertEquals(b1.brokerageName, "vinit");
    }
}