package za.ac.cput.domain;

public class Guest {
    private String guestId;
    private String guestName;
    private String guestPhone;
    private String guestEmail;

    public Guest() {
    }

    private Guest(Builder builder) {
        this.guestId = builder.guestId;
        this.guestName = builder.guestName;
        this.guestPhone = builder.guestPhone;
        this.guestEmail = builder.guestEmail;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public String getGuestId() { return guestId; }
    public String getName() { return guestName; }
    public String getEmail() { return guestEmail; }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId='" + guestId + '\'' +
                ", guestName='" + guestName + '\'' +
                ", guestPhone='" + guestPhone + '\'' +
                ", guestEmail='" + guestEmail + '\'' +
                '}';
    }

    public static class Builder {
        private String guestId;
        private String guestName;
        private String guestEmail;
        private String guestPhone;

        public Builder setGuestPhone(String guestPhone) {
            this.guestPhone = guestPhone;
            return this;
        }

        public Builder setGuestId(String guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder setName(String name) {
            this.guestName = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.guestEmail = email;
            return this;
        }

        public Guest build() {
            return new Guest(this);
        }
    }
}
