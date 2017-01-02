package com.allstate;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void testClientParms(){
        Client c1 = new Client("Zerodha", "vinit", 23, "M");
        assertEquals(c1.brokerageName, "Zerodha");
        assertEquals(c1.clientName, "vinit");
        assertEquals(c1.age, 23);
        assertEquals(c1.gender, "M");

        Client c2 = new Client("Zerodha", "vivek", 24, "M");
        assertEquals(c2.brokerageName, "Zerodha");
        assertEquals(c2.clientName, "vivek");
        assertEquals(c2.age, 24);
        assertEquals(c2.gender, "M");
    }

    @Test
    public void testgetCurrentCash(){
        Client client = new Client("Zerodha", "vinit", 23, "M");
        client.setCurrentCash(5000);
        assertEquals(client.brokerageName, "Zerodha");
        assertEquals(client.clientName, "vinit");
        assertEquals(client.age, 23);
        assertEquals(client.gender, "M");
        assertEquals(client.getCurrentCash(), 5000);
    }

    @Test
    public void testdepositFund(){
        Client client = new Client("Zerodha", "vinit", 23, "M");
        client.setCurrentCash(5000);
        assertEquals(client.getCurrentCash(), 5000);
        assertEquals(client.depositFund(500), 5500);
    }

    @Test
    public void testwithdrawFund(){
        Client client = new Client("Zerodha", "vinit", 23, "M");
        client.setCurrentCash(5000);
        assertEquals(client.getCurrentCash(), 5000);
        assertEquals(client.withdrawFund(2000), 3000);
    }
}