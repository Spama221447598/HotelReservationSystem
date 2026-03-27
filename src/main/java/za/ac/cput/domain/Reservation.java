package za.ac.cput.domain;

public class Reservation {
    private String reservationId;
    private String guestId;
    private String roomId;

    public Reservation() {
    }

    private Reservation(Builder builder) {
        this.reservationId = builder.reservationId;
        this.guestId = builder.guestId;
        this.roomId = builder.roomId;
    }

    public String getReservationId() { return reservationId; }
    public String getGuestId() { return guestId; }
    public String getRoomId() { return roomId; }

    public static class Builder {
        private String reservationId;
        private String guestId;
        private String roomId;

        public Builder setReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder setGuestId(String guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }
    }
}
