package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_out_message_when_call_printOwing_given_orders_and_name() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1.0));
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("felicity",orders);
        assertEquals("*****************************\r\n" +
                "****** Customer totals ******\r\n" +
                "*****************************\r\n" +
                "name: felicity\r\n" +
                "amount: 1.0\r\n", outContent.toString());
    }
}