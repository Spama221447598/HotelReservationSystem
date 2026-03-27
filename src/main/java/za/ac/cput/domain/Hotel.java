package za.ac.cput.domain;

public class Hotel {
    private String hotelName;
    private String hotelId;
    private String hotelLocation;
    private HotelStatus hotelStatus;

    public Hotel() {
    }

    private Hotel(Builder builder) {
        this.hotelId = builder.hotelId;
        this.hotelName = builder.name;
        this.hotelLocation = builder.location;
        this.hotelStatus = builder.hotelStatus;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getName() {
        return hotelName;
    }

    public String getLocation() {
        return hotelLocation;
    }

    public HotelStatus hotelStatus() {
        return hotelStatus;
    }

    public static class Builder {
        private String hotelId;
        private String name;
        private String location;
        private HotelStatus hotelStatus;

        public Builder setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setHotelId(HotelStatus hotelStatus) {
            this.hotelStatus = hotelStatus;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }
    }

}
