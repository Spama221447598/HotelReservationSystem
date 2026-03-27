package za.ac.cput.domain;

public class Room {
    private String roomId;
    private String roomPrice;
    private RoomType roomType;

    public Room() {
    }

    private Room(Builder builder) {
        this.roomId = builder.roomId;
        this.roomType = builder.roomType;
        this.roomPrice = builder.price;
    }

    public String getRoomId() { return roomId; }
    public RoomType getType() { return roomType; }
    public String getPrice() { return roomPrice; }

    public static class Builder {
        private String roomId;
        private RoomType roomType;
        private String price;

        public Builder setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public Builder setType(RoomType type) {
            this.roomType = type;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
}
