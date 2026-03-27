package za.ac.cput.factory;

import za.ac.cput.domain.Hotel;
import za.ac.cput.domain.HotelStatus;
import za.ac.cput.util.Helper;

public class HotelFactory {

    public static Hotel createHotel(String hotelName, String hotelId, String hotelLocation, HotelStatus hotelStatus) {
        if ((Helper.isNullOrEmpty(hotelId)) || (Helper.isNullOrEmpty(hotelName))) {
            throw new IllegalArgumentException("Guest ID or name is null or empty");
        }

        return new Hotel.Builder()
                .setHotelId(hotelId)
                .setName(hotelName)
                .setLocation(hotelLocation)
                .setStatus(hotelStatus)
                .build();
    }
}
