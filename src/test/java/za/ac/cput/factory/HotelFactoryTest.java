package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Guest;
import za.ac.cput.domain.Hotel;
import za.ac.cput.domain.HotelStatus;

import static org.junit.jupiter.api.Assertions.*;

class HotelFactoryTest {

    @Test
    void createHotel() {
        Hotel hotel1 = HotelFactory.createHotel("SandtonHouse", "SH32", "KZN" , HotelStatus.AVAILABLE);
        assertNotNull(hotel1);
        System.out.println(hotel1);
    }
}