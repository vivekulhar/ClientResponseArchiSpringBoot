package dev.vivek.request;

import lombok.Data;

@Data
public class PassengerInfo {
    private String fname;
    private String lname;
    private String from;
    private String to;
    private String journeyDate;
    private String flightId;
}
