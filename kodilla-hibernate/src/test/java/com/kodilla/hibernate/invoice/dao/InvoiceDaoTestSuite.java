package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
       //Given
        Product hardDrive = new Product("Hard drive");
        Product memory = new Product("RAM 4GB");
        Product motherBoard = new Product("Mother board");
        Product keyboard = new Product("Keyboard");

        Item item1 = new Item(new BigDecimal(250), 3);
        Item item2 = new Item(new BigDecimal(180), 10);
        Item item3 = new Item(new BigDecimal(634), 1);
        Item item4 = new Item(new BigDecimal(25), 5);

        item1.setProduct(hardDrive);
        item2.setProduct(memory);
        item3.setProduct(motherBoard);
        item4.setProduct(keyboard);

        Invoice invoice = new Invoice("1234/R/02/2022");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //Clean up
        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
