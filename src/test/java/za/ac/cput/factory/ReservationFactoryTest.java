package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Invoice;
import za.ac.cput.domain.InvoiceStatus;
import za.ac.cput.domain.Reservation;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {

    @Test
    void createReservation() {
        Reservation reservation1 = ReservationFactory.createReservation("r-s265", "SP125", "B4");
        assertNotNull(reservation1);
        System.out.println(reservation1);
    }
}