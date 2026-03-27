package za.ac.cput.factory;

import za.ac.cput.domain.Reservation;
import za.ac.cput.util.Helper;

public class ReservationFactory {

    public static Reservation createReservation(String reservationId, String guestId, String roomId) {
        if ((Helper.isNullOrEmpty(reservationId))) {
            throw new IllegalArgumentException("Reservation ID is null or empty");
        }

        return new Reservation.Builder()
                .setReservationId(reservationId)
                .setGuestId(guestId)
                .setRoomId(roomId)
                .build();
    }
}
