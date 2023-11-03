package dev.vivek.services;

import dev.vivek.request.PassengerInfo;
import dev.vivek.response.TicketInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketService {

    public TicketInfo initiateTicketBooking(PassengerInfo passengerInfo){

        String endPointUrl = "http://localhost:9090/bookTicket";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<TicketInfo> ticketInfo = rt.postForEntity(endPointUrl, passengerInfo, TicketInfo.class);
        TicketInfo ticket = ticketInfo.getBody();
        return ticket;

    }
}
