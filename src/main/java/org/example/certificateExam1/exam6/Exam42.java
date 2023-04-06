package org.example.certificateExam1.exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam42 {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        places.add("Austin");
        places.add("Okinawa");
        places.add("Giza");
        places.add("Manila");
        places.add("Batam");
        places.add("Giza");

        if(places.remove("Giza"))
            places.remove("Austin");

        System.out.println(places);
    }
}
