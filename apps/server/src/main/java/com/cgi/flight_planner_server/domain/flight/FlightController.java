package com.cgi.flight_planner_server.domain.flight;

import com.cgi.flight_planner_server.domain.flight.dto.FlightResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FlightResponse> getFlights() {
        /*
        From last-man projekt. Ma tegelikult ei mõista täielikult seda shorthand-i siin.
        Aga enam-vähem saan aru, et võetakse DB-st kõik andmed ja siis tehakse Mapperi abil listiks.
        */
        return flightService.getAll().stream().map(FlightMapper::from).toList();
    }
}
