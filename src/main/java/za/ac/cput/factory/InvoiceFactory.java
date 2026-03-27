package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;
import za.ac.cput.domain.InvoiceStatus;
import za.ac.cput.util.Helper;

public class InvoiceFactory {

    public static Invoice createInvoice(String invoiceID, String reservationId, double amount, InvoiceStatus invoiceStatus) {
        if ((Helper.isNullOrEmpty(invoiceID))) {
            throw new IllegalArgumentException("Invoice ID is null or empty");
        }

        if (amount <= 0) {
            System.out.println("Price per month must be greater than zero");
        }

        return new Invoice.Builder()
                .setInvoiceId(invoiceID)
                .setReservationId(reservationId)
                .setAmount(amount)
                .setStatus(invoiceStatus)
                .build();
    }
}
