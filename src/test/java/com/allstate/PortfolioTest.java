package com.allstate;


import org.junit.Test;
import static org.junit.Assert.*;


public class PortfolioTest {

    @Test
    public void testPortfolioCration(){
        Portfolio port1 = new Portfolio("Technology");
        assertEquals(port1.name, "Technology");

        Portfolio port2 = new Portfolio("Health");
        assertEquals(port2.name, "Health");

        Portfolio port3 = new Portfolio("Energy");
        assertEquals(port3.name, "Energy");
    }
}
