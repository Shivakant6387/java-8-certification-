package org.example.certificateExam1.exam6;

import java.sql.SQLException;

public class Exam63 {
    private static void getReport() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw null; //Line 10
        }
    }

    public static void main(String[] args) {
        try {
            getReport(); //Line 16
        } catch(SQLException e) {
            System.out.println("REPORT ERROR");
        }
    }
}
