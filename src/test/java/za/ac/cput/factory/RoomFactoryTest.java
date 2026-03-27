package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Reservation;
import za.ac.cput.domain.Room;
import za.ac.cput.domain.RoomType;

import static org.junit.jupiter.api.Assertions.*;

class RoomFactoryTest {

    @Test
    void createRoom() {
        Room room1 = RoomFactory.createRoom("C34", RoomType.NOT_AVAILABLE, "1150");
        assertNotNull(room1);
        System.out.println(room1);
    }
}