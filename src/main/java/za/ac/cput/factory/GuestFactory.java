package za.ac.cput.factory;

import za.ac.cput.domain.Guest;
import za.ac.cput.util.Helper;

public class GuestFactory {

    public static Guest createGuest(String id, String name, String phone, String email) {
        if ((Helper.isNullOrEmpty(id)) || (Helper.isNullOrEmpty(name))) {
            throw new IllegalArgumentException("Guest ID or name is null or empty");
        }
        if (!Helper.isValidEmail(email)){
            throw new IllegalArgumentException("Invalid email address");
        }

        return new Guest.Builder()
                .setGuestId(id)
                .setName(name)
                .setGuestPhone(phone)
                .setEmail(email)
                .build();
    }
}
