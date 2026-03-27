package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Guest;

import static org.junit.jupiter.api.Assertions.*;

class GuestFactoryTest {

    @Test
    void createGuest() {
            Guest guest1 = GuestFactory.createGuest("283177", "Sanda Pama", "067 182 9179" , "spama@cput.com");
            assertNotNull(guest1);
            System.out.println(guest1);
        }
}
