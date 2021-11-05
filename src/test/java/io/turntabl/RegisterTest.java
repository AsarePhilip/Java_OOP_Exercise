package io.turntabl;

import org.junit.Before;
import org.junit.Test;


import java.util.*;

import static org.junit.Assert.*;

public class RegisterTest {

    Register register;
    List<Client> clients;

    @Before
    public void setUp() throws Exception {
        clients = Arrays.asList(
                new CorporateClient(11, "Corporate11", ServiceLevel.GOLD, "Corp 1 manager"),
                new CorporateClient(12, "Corporate12", ServiceLevel.PREMIUM, "Corp 2 manager"),
                new CorporateClient(13, "Corporate13", ServiceLevel.PLATINUM, "Corp 3 manager"),
                new CorporateClient(14, "Corporate14", ServiceLevel.PREMIUM, "Corp 4 manager"),
                new CorporateClient(15, "Corporate15", ServiceLevel.GOLD, "Corp 5 manager"),
                new PrivateClient(21, "Corporate21", ServiceLevel.GOLD),
                new PrivateClient(22, "Corporate22", ServiceLevel.PREMIUM),
                new PrivateClient(23, "Corporate23", ServiceLevel.PLATINUM),
                new PrivateClient(24, "Corporate24", ServiceLevel.GOLD),
                new PrivateClient(25, "Corporate24", ServiceLevel.GOLD)
                );
        register = new Register(clients);
    }

    @Test
    public void getClientsNameByServiceLevel() {
        assertEquals(
                Arrays.asList("Corp 1 manager", "Corp 5 manager", "Corporate21","Corporate24","Corporate24") ,
                register.getClientsNameByServiceLevel(ServiceLevel.GOLD)
        );
    }

    @Test
    public void getClientName() {
        assertEquals( register.getClients().get(0).getName(), "Corp 1 manager");

    }

    @Test
    public void getServiceLevelCount() {
        System.out.println(register.getServiceLevelCount());

    }

    @Test
    public void getClients() {
        assertEquals(register.clients, clients);

    }

}