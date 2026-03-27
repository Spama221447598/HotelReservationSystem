package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.InvoiceStatus;
import za.ac.cput.domain.Invoice;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceFactoryTest {

    @Test
    void createInvoice() {
        Invoice invoice1 = InvoiceFactory.createInvoice("0025", "ID0025", 45098 , InvoiceStatus.PAID);
        assertNotNull(invoice1);
        System.out.println(invoice1);
    }
}