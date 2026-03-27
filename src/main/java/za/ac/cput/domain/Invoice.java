package za.ac.cput.domain;

public class Invoice {
    private String invoiceId;
    private String reservationId;
    private double amount;
    private InvoiceStatus status; // PAID / UNPAID

    public Invoice() {
    }

    private Invoice(Builder builder) {
        this.invoiceId = builder.invoiceId;
        this.reservationId = builder.reservationId;
        this.amount = builder.amount;
        this.status = builder.status;
    }

    public String getInvoiceId() { return invoiceId; }
    public String getReservationId() { return reservationId; }
    public double getAmount() { return amount; }
    public InvoiceStatus getStatus() { return status; }

    public static class Builder {
        private String invoiceId;
        private String reservationId;
        private double amount;
        private InvoiceStatus status;

        public Builder setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setStatus(InvoiceStatus status) {
            this.status = status;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}
