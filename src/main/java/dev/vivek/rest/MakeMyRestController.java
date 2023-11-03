package dev.vivek.rest;

import dev.vivek.request.PassengerInfo;
import dev.vivek.response.TicketInfo;
import dev.vivek.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeMyRestController {
    @Autowired
    TicketService ticketService;


    @PostMapping(value = "/bookTicket",
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){


        TicketInfo ticketInfo = ticketService.initiateTicketBooking(passengerInfo);
        return new ResponseEntity<>(ticketInfo, HttpStatus.CREATED);
    }
}
