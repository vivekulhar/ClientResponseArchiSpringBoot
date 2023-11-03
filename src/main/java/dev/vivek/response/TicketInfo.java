package dev.vivek.response;

import lombok.Data;

@Data
public class TicketInfo {
    private String name;
    private String from;
    private String to;
    private String journeyDate;
    private String flightId;
    private String ticketPrice;
    private String ticketStatus;
}
