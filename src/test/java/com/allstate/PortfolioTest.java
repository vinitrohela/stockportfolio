package com.allstate;


import org.junit.Test;
import static org.junit.Assert.*;


public class PortfolioTest {

    @Test
    public void testPortfolioCration(){
        Portfolio port = new Portfolio("Technology");
        assertEquals(port.name, "Technology");

    }


}
