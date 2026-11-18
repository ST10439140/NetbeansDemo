/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog6112_exam_2024_q1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kheth
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of TotalMovieSales method, of class MovieTickets.
     */
    @Test
    public void testCalculateTotalSales_ReturnsExpectedTotalSales() {
        MovieTickets processor = new MovieTickets();
        int[] sales = {3000, 1500, 1700};
        int expected = 6200;
        int actual = processor.TotalMovieSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void testTopMovieSales_ReturnsTopMovie() {
        MovieTickets processor = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};
        String expected = "Oppenheimer";
        String actual = processor.TopMovie(movies, totalSales);
        assertEquals(expected, actual);
    }
    
}
