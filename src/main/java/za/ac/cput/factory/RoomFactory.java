package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

public class RoomFactory {

    public static Room createRoom(String roomId, RoomType roomType, String roomPrice) {
        if ((Helper.isNullOrEmpty(roomId))) {
            throw new IllegalArgumentException("Reservation ID is null or empty");
        }

        return new Room.Builder()
                .setRoomId(roomId)
                .setType(roomType)
                .setPrice(roomPrice)
                .build();
    }

}
