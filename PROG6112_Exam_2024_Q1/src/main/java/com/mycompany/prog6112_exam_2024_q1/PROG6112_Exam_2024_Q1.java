/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112_exam_2024_q1;

/**
 *
 * @author kheth
 */
public class PROG6112_Exam_2024_Q1 {

    public static void main(String[] args) {
        // -----------------------------------------------------
        // SINGLE-DIMENSIONAL ARRAYS
        // -----------------------------------------------------

        // Stores the month headings.
        String[] months = {
            "JAN",
            "FEB",
            "MAR"
        };

        // Stores the movie headings.
        String[] movies = {
            "Napoleon",
            "Oppenheimer"
        };


        // -----------------------------------------------------
        // TWO-DIMENSIONAL ARRAY
        // -----------------------------------------------------

        // Each ROW represents a movie.
        // Each COLUMN represents a month.
        int[][] ticketSales = {
            {3000, 1500, 1700},
            {3600, 1200, 1600}
        };
        MovieTickets ticketProcessor = new MovieTickets();
        int[] totalSalesArray = new int[movies.length];
        
        // Display report header[cite: 18]
        System.out.println("MOVIE TICKET SALES REPORT 2024");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "", months[0], months[1], months[2]);

        // Print table rows and calculate totals
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-15s ", movies[i]);
            for (int j = 0; j < ticketSales[i].length; j++) {
                System.out.printf("%-10d", ticketSales[i][j]);
            }
            System.out.println();

            // Calculate total sales for each movie using the interface method[cite: 18]
            totalSalesArray[i] = ticketProcessor.TotalMovieSales(ticketSales[i]);
        }

        System.out.println("--------------------------------------------------");

        // Print total movie ticket sales for each movie[cite: 18]
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Total movie ticket sales for " + movies[i] + ": " + totalSalesArray[i]);
        }

        // Determine and display the top-performing movie[cite: 18]
        String topMovie = ticketProcessor.TopMovie(movies, totalSalesArray);
        System.out.println("Top performing movie: " + topMovie);
    }
}
